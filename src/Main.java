import automobil.Automobil;
import person.Person;

public class Main {

    public static void main(String[] args) {
      /*  Person ion = new Person();
        ion.age = 20;

        System.out.println(ion.getAge());

        Person andrei = new Person();
        andrei.age = 27;

        System.out.println(andrei.getAge()); */


        /* boolean a = 1 > 2  || 5 > 3 || 2 < 3;

       // System.out.println(a); */


//        int anProducere = 2007;
//
//        String nume = "Ion Luca";
//
//        System.out.println(nume.contains("luc"));

        Automobil bmw = new Automobil();
        bmw.anProducere = 2008;
        bmw.marca = "BMW";
        bmw.model = "Seria 3";

        bmw.printVariables();

        Automobil audi = new Automobil();
        audi.anProducere = 2010;
        audi.marca = "AUDI";
        audi.model = "A4";

        audi.printVariables();





    }
}