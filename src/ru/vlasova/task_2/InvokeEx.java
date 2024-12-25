package ru.vlasova.task_2;

public class InvokeEx {

    @Invoke
    public void anMethod() {
        System.out.println("метод с аннотацией @Invoke был вызван");
    }

}
