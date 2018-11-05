package project.utils;

public enum Stars {

    ONE_STAR(20),
    TWO_STAR(40),
    THREE_STAR(70),
    FOUR_STAR(90),
    FIVE_STAR(120);

    private int value;

    private Stars(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
