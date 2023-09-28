package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Animal("Fidler", 3,Typ.PIG);
        Animal an2 = new Animal("Vasek", 4,Typ.CAT);
        Animal an3 = new Animal("Kukso", 2,Typ.DOG);


        System.out.println(an1 + "\n" + an2 + "\n" + an3 );

    }
}
