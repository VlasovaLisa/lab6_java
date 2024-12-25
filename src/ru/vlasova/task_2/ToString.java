package ru.vlasova.task_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //доступна во время выполнения программы
@Target({ElementType.TYPE, ElementType.FIELD}) //применима к типу или поле

public @interface ToString {
    String value() default "YES"; //значение по умолчанию да
}
