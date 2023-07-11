package models.enums;

public enum Department {
    EXECUTIVE("Executive"),
    HR("HR"),
    OPERATIONS("Operations"),
    IT("IT"),
    SALES("Sales"),
    FACILITIES("Facilities");

    private final String department;

    Department(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}
