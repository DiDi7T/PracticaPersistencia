package ui;

import control.PersonController;
import model.Person;
import model.PersonCCComparator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    private PersonController controller;
    public Main(){
        controller = new PersonController();
    }
    public static void main(String[] args){

        PersonController controller=new PersonController();

        controller.createPerson("Name5",50,"A50");
        controller.createPerson("Name3",30,"A30");
        controller.createPerson("Name4",40,"A40");
        controller.createPerson("Name2",20,"A20");
        controller.createPerson("Name1",10,"A10");

        System.out.println(controller.getPeople());

        //ArrayList<Person> sorted=controller.selectionSort(controller.getPeople());
        ArrayList<Person> sorted=controller.insertionSort(controller.getPeople());

        System.out.println(sorted);

//       Main main = new Main();
//       main.controller.createPerson("name2",20,"12949459");
//        main.controller.createPerson("name",10,"12347");
//        main.controller.createPerson("name3",18,"123");
//        System.out.println(main.controller.getPeople());
//        main.controller.save();
//        main.controller.clearList();
//        System.out.println(main.controller.getPeople());
//        main.controller.load();
//        System.out.println(main.controller.getPeople());
//        System.out.println(main.controller.getPeople().get(0).getAge());
//
//        System.out.println(main.controller.getPeople().get(0).compareTo(main.controller.getPeople().get(1)));
//
//
//        //Definir un comparador externo a la clase persona
//        //Comparar personas en base a su cedula
//        //Colletions.sort -> ordenar en base al criterio
//        //de comparacion del comparador
//        PersonCCComparator comparator =new PersonCCComparator();
//        Collections.sort(main.controller.getPeople(),comparator);
//        System.out.println(main.controller.getPeople());
//        //Se le da una lista de personas, esa clase persona debe tener definido un criterio de comparacion
//        //interno. La clase persona debe ser comparable
//        //Collections.sort(main.controller.getPeople());

        /**
        File projectDir =new File(System.getProperty("user.dir"));
        System.out.println("variable project" + projectDir);
        System.out.println("variable project" + projectDir.getAbsolutePath());
        System.out.println("variable project" + projectDir.getPath());
        System.out.println("variable name: " + projectDir.getName()); //Ruta relativa del proyecto
        File data = new File(projectDir+"\\src\\main\\data");
        System.out.println(data.exists());
        data.mkdir();
        System.out.println(data.exists());
         */
    }
}
