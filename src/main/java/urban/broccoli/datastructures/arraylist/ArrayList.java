package urban.broccoli.datastructures.arraylist;

import lombok.ToString;

import java.util.Collection;

@ToString
public class ArrayList<T> {

  private final static int DEFAULT_SIZE = 10;

  private int size;

  private Object[] values;

  public ArrayList() {
    values = new Object[DEFAULT_SIZE];
  }

  public ArrayList(Collection<? extends T> c) {
    if (c.size() > 0) {
      values = c.toArray();
      size = values.length;
    }
  }

  public ArrayList(int initialCapasity) {
    values = new Object[initialCapasity];
  }

  public int size() {
    return size;
  }

  public void add(T object) {
    values[size] = object;
    size++;
  }

  public void add(T object, int index) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    System.arraycopy(values, index, values, index + 1, size - index);
    values[index] = object;
    ++size;
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      values[i] = null;
    }
    size = 0;
  }

  public boolean contains(Object o) {
    return indexOf(o) >= 0;
  }

  public Object get(int index) {
    if (index < size && index >= 0) {
      return values[index];
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (values[i].equals(o)) {
        return i;
      }
    }
    return -1;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void remove(int index) {
    if (index > size) {
      throw new IndexOutOfBoundsException();
    }
    System.arraycopy(values, index + 1, values, index, size - index - 1);
    values[--size] = null;
  }

  public void remove(Object o) {
    int index = indexOf(o);
    if (index >= 0) {
      System.arraycopy(values, index + 1, values, index, size - index - 1);
      size--;
      values[size] = null;
    }
  }

  public Object set(Object o, int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Object oldObject = values[index];
    values[index] = o;
    return oldObject;
  }

  public Object[] toArray() {
    Object[] newArray = new Object[size];
    System.arraycopy(values, 0, newArray, 0, size);
    return newArray;
  }

  public ListIterator listIterator() {
    return new ListIterator();
  }

  class ListIterator {

    /**
     * index of current object
     */
    private int index = 0;

    public boolean hasNext() {
      return index < size;
    }

    public boolean hasPrevious() {
      return index > 0;
    }

    public Object next() {
      if (!hasNext()) {
        throw new IndexOutOfBoundsException();
      }
      return values[index++];
    }

    public Object previous() {
      if (!hasPrevious()) {
        throw new IndexOutOfBoundsException();
      }
      return values[--index];
    }

    public int nextIndex() {
      return index;
    }

    public int previousIndex() {
      return index - 1;
    }
  }

}
