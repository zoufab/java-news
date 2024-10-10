package com.zou.sequenced_collection.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.SequencedCollection;
import java.util.SequencedMap;

/**
 * Represents a concrete implementation of a sequenced collection.
 * <pre><code>
 * interface SequencedCollection<E> extends Collection<E> {
 *     // new method
 *     SequencedCollection<E> reversed();
 *     // methods promoted from Deque
 *     void addFirst(E);
 *     void addLast(E);
 *     E getFirst();
 *     E getLast();
 *     E removeFirst();
 *     E removeLast();
 * }
 * </code>
 * </pre>
 */
public class ConcretSequencedCollection {
	private SequencedCollection<String> collection = new ArrayList<>();
	private SequencedMap<String, String> map = new LinkedHashMap<>();

	/**
	 * This method demonstrates the usage and exploration of a sequenced collection.
	 * A sequenced collection is an extension of the Collection interface that maintains
	 * the order of its elements. It provides additional methods for adding and removing
	 * elements at the beginning and end of the collection.
	 *
	 * @see SequencedCollection
	 */
	public void exploringSequencedCollection() {
        collection.addFirst("Element 1");
		collection.addLast("Element 2");

		System.out.println("First element: " + collection.getFirst());
		System.out.println("Last element: " + collection.getLast());

		collection.removeFirst();
		System.out.println("After removing first element: " + collection);

		collection.removeLast();
		System.out.println("After removing last element: " + collection);

		collection.addFirst("Element 3");
		collection.add("Element 4");

		System.out.println("Collection after adding elements: " + collection);

		SequencedCollection<String> reversed = collection.reversed();
		System.out.println("Reversed collection: " + reversed);

		collection.add("Element 5");
		System.out.println("Last element: " + collection.getLast());
    }

	public void exploringSequencedMap() {
		map.put("Key 1", "Value 1");
		map.put("Key 2", "Value 2");

		System.out.println("Map: " + map);

        map.remove("Key 1");
		System.out.println("After removing Key 1: " + map);

        map.put("Key 3", "Value 3");
		System.out.println("After adding Key 3: " + map);

        map.put("Key 2", "Updated Value 2");
		System.out.println("After updating Key 2: " + map);

		System.out.println("Value of Key 1: " + map.get("Key 1"));
		System.out.println("Value of Key 3: " + map.get("Key 3"));

		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());

		map.reversed().forEach((key, value) -> System.out.println("Reversed Key-Value pair: " + key + " - " + value));

        map.put("Key 4", "Value 4");
		System.out.println("First Key-Value pair: " + map.firstEntry().toString());
		System.out.println("Last Key-Value pair: " + map.lastEntry().toString());

		map.putFirst("Key 5", "Value 5");
		map.putLast("Key 6", "Value 6");
		System.out.println("Map after adding more Key-Value pairs: " + map);
		
	}
}
