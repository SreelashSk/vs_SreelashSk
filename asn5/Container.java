package edu.disease.asn5;

import java.util.Arrays;
import java.util.List;

/**
 * Creates a Container class, it can store multiple of items of varying types in
 * a single variable using Generic.
 * 
 * @param <T>
 */
public class Container<T> {
	List<T> ts;

	 /**
     * Constructs a Container.
     *
     * @param ts The items to be stored in the container.
     * @throws IllegalArgumentException If no items are provided (null values are not allowed).
     */
	public Container(T... ts) {
		if (ts.length == 0) {
			throw new IllegalArgumentException("null values are not allowed");
		}
		this.ts = Arrays.asList(ts);
	}

	 /**
     * Returns the number of items stored in the container.
     *
     * @return The size of the container.
     */
	public Integer size() {
		return ts.size();
	}

	/**
     * Retrieves an item from the container at the specified index.
     *
     * @param index 
     * @return The item at the specified index.
     * @throws IllegalArgumentException If the index is invalid.
     */
	public T get(int index) {
		if (0 < index && index >= ts.size()) {
			throw new IllegalArgumentException("invalid index :(");
		}
		return ts.get(index);

	}
}
