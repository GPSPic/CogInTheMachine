package com.cogs.CogInTheMachine.models.enums;

public enum PositionEnum {
    CEO("CEO"),
    COO("COO"),
    CTO("CTO"),
    PA("Personal Assistant"),
    IT_MANAGER("IT Manager"),
    SENIOR_DEV("Senior Developer"),
    SOFTWARE_DEV("Software Developer"),
    HR_MANAGER("HR Manager"),
    HR_EXEC("HR Executive"),
    EXECUTIVE_ASSISTANT("Executive Assistant"),
    SALES_MANAGER("Sales Manager"),
    SALES_EXECUTIVE("Sales Executive"),
    OFFICE_MANAGER("Office Manager"),
    JANITOR("Janitor");

    private final String role;

    PositionEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
