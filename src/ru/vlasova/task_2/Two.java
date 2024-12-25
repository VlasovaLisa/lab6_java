package ru.vlasova.task_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //доступна во время выполнения программы
@Target({ElementType.TYPE}) //применима к типу

public @interface Two {
    String first();
    int second();
}
