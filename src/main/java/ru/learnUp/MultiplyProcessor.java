package ru.learnUp;

import ru.learnUp.Interface;

public class MultiplyProcessor implements Interface {
    @Override
    public long process(long arg1, long arg2) {
        return arg1*arg2;
    }
}
