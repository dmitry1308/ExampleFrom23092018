package ru.schepin.examples.maxPair;

public class Pair {
    private int numberOne;
    private int numberTwo;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }
}
