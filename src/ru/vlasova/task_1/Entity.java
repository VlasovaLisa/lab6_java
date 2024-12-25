package ru.vlasova.task_1;

import java.lang.reflect.Field;

public class Entity {

    //рбработка полей всех классов в иерархии
    //переобразование объекта в строковое представление
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Class<?> clazz = this.getClass();

        //добавляем имя класса
        result.append(clazz.getSimpleName()).append("{");

        //получаем все поля включая унаследованные
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    result.append(field.getName()).append("=").append(field.get(this)).append(", ");
                } catch (IllegalAccessException e) {
                    result.append(field.getName()).append("=n/a, ");
                }
            }
            clazz = clazz.getSuperclass();
        }

        //убираем последнюю запятую и пробел и закрываем строку
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }
        result.append("}");
        return result.toString();
    }

}
