package ru.vlasova.task_4;
import ru.vlasova.task_2.*;
import ru.vlasova.task_3.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EntityTest {

    //тест для проверки работы метода toString в классе A
    //класс A имеет поле s (включается в строку) и поле x (аннотировано @ToString(NO))
    @Test
    public void testToStringWithAnnotations() {
        A2 a = new A2();
        String expected = "A2{s=hello}";
        assertEquals(expected, a.toString(), "метод toString должен возвращать только поле s");
    }


    //тест для проверки работы метода toString в классе B
    //класс B наследует A добавляя новое поле text
    @Test
    public void testToStringWithInheritance() {
        B2 b = new B2();
        String expected = "B2{text=B, s=hello}";
        assertEquals(expected, b.toString(), "метод toString должен корректно обрабатывать наследуемые классы");
    }


     //тест для проверки если класс аннотирован @ToString(NO)
     //поля класса A не должны включаться, за исключением явно помеченных полей
    @Test
    public void testToStringWithClassAnnotation() {
        @ToString("NO")
        class C extends Entity2 {
            @ToString("YES")
            String included = "included";

            String excluded = "excluded";
        }

        C c = new C();
        String expected = "C{included=included}";
        assertEquals(expected, c.toString(), "метод toString должен включать только поля с аннотацией @ToString(YES), если класс аннотирован @ToString(NO)");
    }


    //тест для проверки пустого класса
    //если класс не имеет полей строковое представление должно быть пустым
    @Test
    public void testToStringEmptyClass() {
        class Empty extends Entity2 {}
        Empty empty = new Empty();
        String expected = "Empty{}";
        assertEquals(expected, empty.toString(), "метод toString должен корректно обрабатывать пустые классы");
    }
}
