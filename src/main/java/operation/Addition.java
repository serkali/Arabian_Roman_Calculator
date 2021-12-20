package operation;

public class Addition implements Operation {
    @Override
    public int operation(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
