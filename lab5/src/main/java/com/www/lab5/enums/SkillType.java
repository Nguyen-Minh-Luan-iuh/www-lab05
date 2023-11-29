package com.www.lab5.enums;

public enum SkillType {
    SOFT_SKILL(0),
    UNSPECIFIC(1),
    TECHNICAL_SKILL(2);

    private int value;

    SkillType(int value) {
        this.value = value;
    }
}
