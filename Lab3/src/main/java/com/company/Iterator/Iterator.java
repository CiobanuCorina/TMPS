package com.company.Iterator;

import javax.naming.SizeLimitExceededException;

public abstract class Iterator {
    protected int currentIndex = 0;

    public abstract Object getNext() throws SizeLimitExceededException;
    public abstract boolean hasMore();
    public abstract Object getCurrent() throws SizeLimitExceededException;
}
