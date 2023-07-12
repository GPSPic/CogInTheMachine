package models.enums;

public enum DepartmentEnum {
    EXECUTIVE("Executive"),
    HR("HR"),
    OPERATIONS("Operations"),
    IT("IT"),
    SALES("Sales"),
    FACILITIES("Facilities");

    private final String department;

    DepartmentEnum(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}
