package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Random rand = new Random();

        System.out.println("===== START STRESS TEST =====");

        // 1. Remove/search/contains on empty list
        System.out.println("\n--- Empty List Ops ---");
        list.print();
        list.removeFirst();
        list.removeLast();
        try { list.removeAt(0); }
        catch (Exception e) {
            System.out.println("Caught expected: " + e); }
        System.out.println("Contains 5? " + list.contains(5));
        System.out.println("Search 5: " + list.search(5));

        // 2. Insert at index edge cases
        System.out.println("\n--- Insert at Edges ---");
        list.insertAt(0, 100);   // insert head
        list.insertAt(1, 200);   // insert tail
        list.insertAt(1, 150);   // insert middle
        list.print(); // 100 -> 150 -> 200
        System.out.println("Size: " + list.getSize());

        // 3. Remove at index edge cases
        System.out.println("\n--- Remove at Edges ---");
        list.removeAt(1);        // remove middle
        list.print(); // 100 -> 200
        list.removeAt(1);        // remove tail
        list.print(); // 100
        list.removeAt(0);        // remove head
        list.print(); // null

        // 4. Fill with many items (sequential)
        System.out.println("\n--- Sequential Add ---");
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        list.print();
        System.out.println("Size after adds: " + list.getSize());

        // 5. Stress removeFirst and removeLast repeatedly
        System.out.println("\n--- Repeated Front/Back Removal ---");
        for (int i = 0; i < 5; i++) list.removeFirst();
        list.print();
        for (int i = 0; i < 5; i++) list.removeLast();
        list.print();
        System.out.println("Size now: " + list.getSize());

        // 6. AddFirst / AddLast combos
        System.out.println("\n--- AddFirst/AddLast Combos ---");
        list.addFirst(999);
        list.addLast(888);
        list.addFirst(777);
        list.print();

        // 7. Search & contains
        System.out.println("\n--- Search/Contains ---");
        list.add(50);
        list.add(60);
        list.add(70);
        list.print();
        System.out.println("Search 60: " + list.search(60));
        System.out.println("Contains 888? " + list.contains(888));
        System.out.println("Contains 123? " + list.contains(123));
        list.removeAt(2); // remove one known value
        list.print();
        System.out.println("Contains 60 after removal? " + list.contains(60));

        // 8. Clear and reuse
        System.out.println("\n--- Clear & Reuse ---");
        list.clear();
        System.out.println("Cleared:");
        list.print();
        System.out.println("Is empty? " + list.isEmpty());
        for (int i = 0; i < 10; i++) list.add(i * 10);
        list.print();

        // 9. Randomized stress test (hundreds of operations)
        System.out.println("\n--- Randomized Stress ---");
        list.clear();
        for (int i = 0; i < 100; i++) {
            int op = rand.nextInt(5);
            int val = rand.nextInt(1000);
            int idx = (list.getSize() == 0) ? 0 : rand.nextInt(list.getSize());
            try {
                switch (op) {
                    case 0 -> list.add(val);
                    case 1 -> list.addFirst(val);
                    case 2 -> list.addLast(val);
                    case 3 -> list.insertAt(idx, val);
                    case 4 -> {
                        if (!list.isEmpty()) list.removeAt(idx);
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception during random op: " + e);
            }
        }
        list.print();
        System.out.println("Final size after random ops: " + list.getSize());

        // 10. Final torture: remove everything
        System.out.println("\n--- Final Full Wipe ---");
        while (!list.isEmpty()) {
            list.removeLast();
        }
        list.print();
        System.out.println("Size: " + list.getSize());
        System.out.println("Is empty? " + list.isEmpty());

        System.out.println("\n===== END STRESS TEST =====");
    }
}