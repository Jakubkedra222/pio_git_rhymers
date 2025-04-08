package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int CAPACITY = 12;
    private static final int LAST_INDEX = CAPACITY - 1;

    final int[] numbers = new int[CAPACITY];

    int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int showPeekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
