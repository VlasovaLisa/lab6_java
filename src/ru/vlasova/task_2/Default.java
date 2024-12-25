package ru.vlasova.task_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //доступна во время выполнения программы
@Target({ElementType.TYPE, ElementType.FIELD}) //применима только к классам или полям

public @interface Default {
    Class<?> value();  //обязательное свойство value типа Class
}
