package ru.vlasova.task_3;
import ru.vlasova.task_2.*;

import java.lang.reflect.Field;

public class Entity2 {
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Class<?> clazz = this.getClass();

        boolean classAnnotatedNo = clazz.isAnnotationPresent(ToString.class) &&
                clazz.getAnnotation(ToString.class).value().equals("NO");

        //добавляем имя класса
        result.append(clazz.getSimpleName()).append("{");

        //получаем все поля включая унаследованные
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);

                ToString annotation = field.getAnnotation(ToString.class);
                boolean includeField = annotation == null || annotation.value().equals("YES");

                if (classAnnotatedNo) {
                    includeField = annotation != null && annotation.value().equals("YES");
                }

                if (includeField) {
                    try {
                        result.append(field.getName()).append("=").append(field.get(this)).append(", ");
                    } catch (IllegalAccessException e) {
                        result.append(field.getName()).append("=n/a, ");
                    }
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
