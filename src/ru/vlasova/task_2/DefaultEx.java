package ru.vlasova.task_2;

@Default(value = DefaultEx.class)  //аннотация применяется к классу передавая ссылку на сам класс
public class DefaultEx {
    private String defaultField;

    public DefaultEx() {
        this.defaultField = "default";
    }

    public String getDefaultField() {
        return defaultField;
    }
}
