package ru.spring.project.cat.items;

public class Cat {
    private final String name;
    private final int monthAge;

    public Cat(String name, int monthAge) {
        this.name = name;
        this.monthAge = monthAge;
    }

    public String getName() {
        return name;
    }

    public int getMonthAge() {
        return monthAge;
    }
}
