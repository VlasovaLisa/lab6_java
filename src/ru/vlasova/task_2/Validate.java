package ru.vlasova.task_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //доступна во время выполнения программы
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE}) //применима к типу или аннотации

public @interface Validate {
    Class<?> value();
}
