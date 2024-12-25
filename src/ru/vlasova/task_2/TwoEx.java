package ru.vlasova.task_2;

@Two(first = "stray kids", second = 25)
public class TwoEx {
    private String first;
    private int second;

    public TwoEx(String first, int second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

}
