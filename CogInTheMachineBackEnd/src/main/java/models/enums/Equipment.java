package models.enums;

public enum Equipment {

    LAPTOP("Laptop"),
    PHONE("Phone"),
    UNIFORM("Uniform"),
    KEY_CARD("Key Card");

    private final String item;

    Equipment(String item) {
        this.item = item;
    }

    public String getItem() {
        return this.item;
    }
}
