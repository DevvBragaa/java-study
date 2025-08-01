package com.imc.body_calculator.enums;

public enum EnumRole {
    ADMIN("admin"),
    COMMON_USER("common_user");

    private final String roleName;

    EnumRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
