//вариант 4 Власова Елизавета

package ru.vlasova.main;
import ru.vlasova.task_1.*;
import ru.vlasova.task_2.*;
import ru.vlasova.task_3.*;


import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        //1.1
        out.println("------------------ЗАДАНИЕ 1.1------------------");
        B b = new B();
        out.println(b); //B{text=B, s=hello, x=42}

        A a = new A();
        out.println(a);

        //2.1
        out.println("------------------ЗАДАНИЕ 2.1------------------");
        InvokeEx ex = new InvokeEx();
        ex.anMethod();

        //2.2
        out.println("------------------ЗАДАНИЕ 2.2------------------");
        DefaultEx ex1 = new DefaultEx();
        out.print("аннотация: ");
        out.println(ex1.getDefaultField());

        //2.3
        out.println("------------------ЗАДАНИЕ 2.3------------------");
        ToStringEx ex2 = new ToStringEx();
        out.println(ex2.toString());

        //2.4
        out.println("------------------ЗАДАНИЕ 2.4------------------");
        ValidateEx ex3 = new ValidateEx("stray kids", "Han");
        out.println("animal: " + ex3.getGroup());
        out.println("name: " + ex3.getNickname());

        //2.5
        out.println("------------------ЗАДАНИЕ 2.5------------------");
        TwoEx ex4 = new TwoEx("aespa", 17);
        out.println("first: " + ex4.getFirst());
        out.println("second: " + ex4.getSecond());

        //2.6
        out.println("------------------ЗАДАНИЕ 2.6------------------");
        CacheEx ex5 = new CacheEx("JYP", 4, 0.63);
        out.println("entertainment: " + ex5.getEntertainment());
        out.println("groups: " + ex5.getGroups());
        out.println("percent: " + ex5.getPercent());

        //3.1
        out.println("------------------ЗАДАНИЕ 3.1------------------");

        A2 a2 = new A2();
        out.println(a2); //A2{s=hello}

        B2 b2 = new B2();
        out.println(b2); //B2{text=B, s=hello}


    }
}