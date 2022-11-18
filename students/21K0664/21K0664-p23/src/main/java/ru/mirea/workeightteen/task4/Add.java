package ru.mirea.workeightteen.task4;

public class Add extends AbstractExpression implements TripleExpression {

    public Add(TripleExpression x, TripleExpression y) {
        leftD = x;
        rightD = y;
    }

    public int evaluate(int x, int y, int z) {
        return leftD.evaluate(x,y,z) + rightD.evaluate(x,y,z);
    }
}