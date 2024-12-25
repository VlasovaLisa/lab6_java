package ru.vlasova.task_2;

@Cache(value = {"value1", "value2", "value3"})
public class CacheEx {
    private String entertainment;
    private int groups;
    private double percent;

    public CacheEx(String entertainment, int groups, double percent) {
        this.entertainment = entertainment;
        this.groups = groups;
        this.percent = percent;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public int getGroups() {
        return groups;
    }

    public double getPercent() {
        return percent;
    }
}
