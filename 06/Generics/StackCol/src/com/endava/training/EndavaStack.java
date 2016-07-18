package com.endava.training;

public class EndavaStack<T extends Number> {

    private T head;

    private EndavaStack<T> tail;

    public EndavaStack(T element) {
      this.head = element;
    }

    public EndavaStack(T ... elems) {
        this.head = elems[0];
        for (int i = 1; i < elems.length; i++) {
            this.push(elems[i]);
        }
    }

    public void push(T elem) {
        if (tail == null) {
            tail = new EndavaStack<T>(this.head);
        } else {
            tail.push(this.head);
        }
        this.head = elem;
    }

    public T getHead() {
        return this.head;
    }

    public T pop() {
        T currentHead = this.head;
        if (tail != null) {
            this.head = this.tail.getHead();
            tail = tail.tail;
        } else {
            this.head = null;
        }
        return currentHead;

    }

    public T maxElement() {
        T max = this.head;
        EndavaStack<T> tailCopy = tail;
        while (tailCopy != null) {
            if (max.intValue() < tailCopy.head.intValue()) {
                max = tailCopy.head;
            }
            tailCopy = tailCopy.tail;
        }

        return max;
    }

    public int size() {
        if (tail == null) {
            return 1;
        } else {
            return  1 + tail.size();
        }
    }

    @Override
    public String toString() {
        if (tail != null)
        return head.toString() + " " + tail.toString();
        else
        return head.toString();
    }
}
