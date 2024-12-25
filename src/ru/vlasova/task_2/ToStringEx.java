package ru.vlasova.task_2;

@ToString(value = "YES")
public class ToStringEx {
    @ToString(value = "NO")
    private String exampleField;

    public ToStringEx() {
    }

    public ToStringEx(String exampleField) {
        this.exampleField = exampleField;
    }

    public String getExampleField() {
        return exampleField;
    }

    @Override
    public String toString() {
        return "аннотация с ToString: " + exampleField;
    }
}
