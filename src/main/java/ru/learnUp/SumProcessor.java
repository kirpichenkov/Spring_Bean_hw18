package ru.learnUp;

import ru.learnUp.Interface;

public class SumProcessor implements Interface {
    @Override
    public long process(long arg1, long arg2) {
        return arg1+arg2;
    }
}
