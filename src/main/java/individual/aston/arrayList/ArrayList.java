package aston.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList<T> {

    T[] array = (T[]) new Object[10];

    /**
     * Calculates the current size of the array, which is the number of non-null elements.
     *
     * <p>The method iterates through the array to determine the last non-null element
     * and returns its index plus one. If the array is completely empty (all elements are null),
     * the size is 0. If the array is fully filled (no null elements), the size is equal to the array's length.</p>
     *
     * @return the number of non-null elements in the array.
     */
    public int size() {
        if (array[array.length - 1] != null) {
            return array.length;
        }
        if (array[0] == null) {
            return 0;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if ((array[i] == null) && (array[i - 1] != null)) {
                return i;
            }
        }
        return 0;
    }

    /**
     * Adds a specified value to the array.
     *
     * <p>The value is appended to the first null position in the array. If the array is full,
     * it is expanded, and the value is appended at the next available position. If adding the
     * value does not result in a change to the list (e.g., due to a restriction), the method returns {@code false}.</p>
     *
     * @param value the value to be added to the array.
     * @return {@code true} if the array was modified as a result of this operation; {@code false} otherwise.
     */
    public boolean add(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = value;
                return true;
            }
        }
        int oldSize = size();
        arrayExpansion();
        array[size()] = value;
        return size() > oldSize;
    }

    /**
     * Inserts a specified value into the array at a given index, shifting subsequent elements to the right.
     *
     * <p>If the array is full, it is expanded to accommodate the new element. The method ensures that
     * all elements at or after the specified index are shifted one position to the right to make space
     * for the new value. If the index is out of bounds, an {@code IndexOutOfBoundsException} is thrown.</p>
     *
     * @param index the position at which the value should be inserted; must be in the range [0, size()].
     * @param value the value to be inserted into the array.
     * @throws IndexOutOfBoundsException if the specified index is negative or greater than {@code size()}.
     */
    public void add(int index, T value) {
        if (index < 0 || index >= size() + 1) {
            throw new IndexOutOfBoundsException();
        }

        if (array.length > size()) {
            for (int i = size() - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
        } else {
            arrayExpansion();
            for (int i = size() - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
        }
        array[index] = value;
    }

    /**
     * Removes the element at the specified position in this array and shifts subsequent elements to the left (subtracts one from their indices).
     * The last element of the array is set to {@code null} to maintain proper size management.
     *
     * @param index the index of the element to be removed, must be in the range {@code 0} to {@code size() - 1}.
     * @return the element that was removed from the array.
     * @throws IndexOutOfBoundsException if the specified index is out of the range {@code 0} to {@code size() - 1}.
     */
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        T returnValue = array[index];
        for (int i = index; i < size() - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size() - 1] = null;
        return returnValue;
    }

    /**
     * Removes the first occurrence of the specified element from this array, if it is present.
     * If the array does not contain the element, it remains unchanged.
     *
     * @param item the element to be removed from the array, if present.
     * @return {@code true} if the array contained the specified element and it was successfully removed;
     * {@code false} otherwise.
     * @throws NullPointerException if the specified element is {@code null}.
     */
    public boolean remove(Object item) {
        for (int i = 0; i < size() - 1; i++) {
            if (array[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;

    }

    /**
     * Retrieves the element at the specified position in this array.
     *
     * @param index the index of the element to return, starting from 0.
     * @return the element at the specified position in the array.
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the current size of the array.
     */
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    /**
     * Increases the size of the internal array to accommodate more elements.
     * <p>
     * This method calculates a new size for the array by increasing its length
     * by 50% of the current size plus 1. The existing elements in the array
     * are copied to the new larger array.
     * </p>
     * <p>
     * This method is used internally to ensure that the array has enough capacity
     * to hold additional elements when the current capacity is exceeded.
     * </p>
     */
    private void arrayExpansion() {
        int newSizeArray = array.length + ((array.length / 2) + 1);
        array = Arrays.copyOf(array, newSizeArray);
    }

    public void printArrays() {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Replaces the element at the specified position in the array with the specified element.
     *
     * @param index   the index of the element to replace
     * @param element the element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        T returnValue = array[index];
        array[index] = element;
        return returnValue;
    }

    /**
     * Returns a view of the portion of the original list between the specified fromIndex, inclusive,
     * and toIndex, exclusive. The returned list is backed by the original array, so changes made to
     * the returned list will be reflected in the original list, and vice versa.
     *
     * @param fromIndex the starting index, inclusive, of the sublist
     * @param toIndex   the ending index, exclusive, of the sublist
     * @return a new {@link List} containing the elements between {@code fromIndex} (inclusive) and
     * {@code toIndex} (exclusive) of the original list
     * @throws IndexOutOfBoundsException if {@code fromIndex} or {@code toIndex} is out of range
     *                                   (fromIndex < 0 || toIndex > size())
     * @throws IllegalArgumentException  if {@code fromIndex} is greater than {@code toIndex}
     */
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        return new java.util.ArrayList<>(Arrays.asList(Arrays.copyOfRange(array, fromIndex, toIndex)));
    }
}