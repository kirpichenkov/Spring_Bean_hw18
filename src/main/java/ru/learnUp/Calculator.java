package ru.learnUp;

public class Calculator {
    final private SumProcessor sum;
    final private SubtractProcessor sub;
    final private MultiplyProcessor mult;
    final private DivideProcessor div;

    public Calculator(SumProcessor sum, SubtractProcessor sub, MultiplyProcessor mult, DivideProcessor div) {
        this.sum = sum;
        this.sub = sub;
        this.mult = mult;
        this.div = div;
    }

    public long sum(long arg1, long arg2){
        return sum.process(arg1,arg2);
    }
    public long sub(long arg1, long arg2){return sub.process(arg1,arg2);}
    public long div (long arg1, long arg2){
        return div.process(arg1,arg2);
    }
    public long mult(long arg1, long arg2){
        return mult.process(arg1,arg2);
    }
}
