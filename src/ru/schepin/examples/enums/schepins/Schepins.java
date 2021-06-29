package ru.schepin.examples.enums.schepins;

public enum Schepins {
    Yuri("Schepin", 178, 93),
    Dmitriy("Schepin", 181, 83),
    Vera("Schepina", 161, 62);


    private final String sourname;
    private final int height;
    private final int weight;

    Schepins(String sourname, int height, int weight) {
        this.sourname = sourname;
        this.height = height;
        this.weight = weight;
    }

    public String getFullInformation() {
        return String.format("%s, %d, %d", sourname, height, weight);
    }
}
