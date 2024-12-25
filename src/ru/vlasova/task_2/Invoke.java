package ru.vlasova.task_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  //доступна во время выполнения программы
@Target(ElementType.METHOD)  //применима только к методам

public @interface Invoke {
}
