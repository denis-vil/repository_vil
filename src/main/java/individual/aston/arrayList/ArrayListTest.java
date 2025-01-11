package aston.arrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


class ArrayListTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 34",
            "3, 102",
            "9, 306"
    })
    void testGet(int index, int expectedValue) {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        Assertions.assertEquals(expectedValue, astonCollectionsArrayList.get(index));
    }

    @Test
    void testGetThrowsExceptionWhenIndexIsOutOfBounds() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        assertThrows(IndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() {
                astonCollectionsArrayList.get(10);
            }
        });
    }

    @Test
    void testGetThrowsExceptionWhenIndexIsNegative() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        assertThrows(IndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() {
                astonCollectionsArrayList.get(-4);
            }
        });
    }

    @Test
    void testAddToEmptyList() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        astonCollectionsArrayList.add(34);
        assertEquals(34, astonCollectionsArrayList.get(0));
        assertEquals(1, astonCollectionsArrayList.size());
    }

    @Test
    void testAddToList() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        astonCollectionsArrayList.add(34);
        astonCollectionsArrayList.add(68);
        assertEquals(34, astonCollectionsArrayList.get(0));
        assertEquals(68, astonCollectionsArrayList.get(1));
        assertEquals(2, astonCollectionsArrayList.size());
    }

    @Test
    void testAddAtIndex() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        astonCollectionsArrayList.add(34);
        astonCollectionsArrayList.add(68);
        astonCollectionsArrayList.add(1, 51);
        assertEquals(34, astonCollectionsArrayList.get(0));
        assertEquals(51, astonCollectionsArrayList.get(1));
        assertEquals(68, astonCollectionsArrayList.get(2));
        assertEquals(3, astonCollectionsArrayList.size());
    }

    @Test
    void testAddAndResize() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        assertEquals(16, astonCollectionsArrayList.size());
        assertEquals(510, astonCollectionsArrayList.get(15));
    }

    @Test
    void testAddDuplicateValues() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        astonCollectionsArrayList.add(34);
        astonCollectionsArrayList.add(34);
        assertEquals(2, astonCollectionsArrayList.size());
        assertEquals(34, astonCollectionsArrayList.get(0));
        assertEquals(34, astonCollectionsArrayList.get(1));
    }

    @Test
    void testRemoveByIndex() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        Integer removedValue = astonCollectionsArrayList.remove(3);
        assertEquals(102, removedValue);
        assertEquals(9, astonCollectionsArrayList.size());
        assertEquals(136, astonCollectionsArrayList.get(3));
    }

    @Test
    void testRemoveByIndexInvalidIndex() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> astonCollectionsArrayList.remove(10));
        assertThrows(IndexOutOfBoundsException.class, () -> astonCollectionsArrayList.remove(-1));
    }

    @Test
    void testRemoveByObject() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        boolean isRemoved = astonCollectionsArrayList.remove(Integer.valueOf(102));
        assertTrue(isRemoved);
        assertEquals(9, astonCollectionsArrayList.size());
        assertEquals(136, astonCollectionsArrayList.get(3));
    }

    @Test
    void testRemoveNonExistentElement() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        boolean isRemoved = astonCollectionsArrayList.remove(Integer.valueOf(999));
        assertFalse(isRemoved);
        assertEquals(10, astonCollectionsArrayList.size());
    }

    @Test
    void testRemoveFirstElement() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        Integer removedValue = astonCollectionsArrayList.remove(0);
        assertEquals(0, removedValue);
        assertEquals(9, astonCollectionsArrayList.size());
        assertEquals(34, astonCollectionsArrayList.get(0));
    }

    @Test
    void testRemoveLastElement() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        Integer removedValue = astonCollectionsArrayList.remove(9);
        assertEquals(306, removedValue);
        assertEquals(9, astonCollectionsArrayList.size());
    }

    @Test
    void testRemoveMiddleElement() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        Integer removedValue = astonCollectionsArrayList.remove(5);
        assertEquals(170, removedValue);
        assertEquals(9, astonCollectionsArrayList.size());
        assertEquals(204, astonCollectionsArrayList.get(5));
    }

    @Test
    void testRemoveAfterResize() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            astonCollectionsArrayList.add(i * 34);
        }
        Integer removedValue = astonCollectionsArrayList.remove(5);
        assertEquals(170, removedValue);
        assertEquals(15, astonCollectionsArrayList.size());
    }

    @Test
    void testRemoveEmptyList() {
        ArrayList<Integer> astonCollectionsArrayList = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> astonCollectionsArrayList.remove(0));
    }
}