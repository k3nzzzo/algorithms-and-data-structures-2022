package ru.mirea.workeightteen.task3;

public class Divide extends AbstractExpression implements DoubleExpression, Expression {

    public Divide(DoubleExpression x, DoubleExpression y) {
        leftD = x;
        rightD = y;
    }

    @Override
    public double evaluate(double x) {
        return (double) leftD.evaluate(x) / (double) rightD.evaluate(x);
    }

    @Override
    public int evaluate(int x) {
        return (int) leftD.evaluate(x) / (int) rightD.evaluate(x);
    }
}