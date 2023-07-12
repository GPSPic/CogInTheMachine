package models.enums;

public enum EquipmentEnum {

    LAPTOP("Laptop"),
    PHONE("Phone"),
    UNIFORM("Uniform"),
    KEY_CARD("Key Card");

    private final String item;

    EquipmentEnum(String item) {
        this.item = item;
    }

    public String getItem() {
        return this.item;
    }
}
