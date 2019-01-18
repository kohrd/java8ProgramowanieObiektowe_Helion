package pl.Java8_OOP_Helion.OOP_11_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main11_03 {

    String name;
    String surname;
    int age;

    @Override // metody generowane przez intelij
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // porównuje klasy
        Main11_03 main11_03 = (Main11_03) o; //rzutowanie obiektu na klase
        return age == main11_03.age &&
                Objects.equals(name, main11_03.name) &&
                Objects.equals(surname, main11_03.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public static void main(String[] args) {
        Main11_03 main11_03 = new Main11_03();
        main11_03.name = "konrad";
        main11_03.surname = "janeczek";
        main11_03.age = 3;
        System.out.println(main11_03.name.hashCode());
    }


}

