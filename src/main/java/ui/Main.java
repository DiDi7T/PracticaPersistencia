package ui;

import control.PersonController;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    private PersonController controller;
    public Main(){
        controller = new PersonController();
    }
    public static void main(String[] args){
       Main main = new Main();
       main.controller.createPerson("name2",20,"12341");
        main.controller.createPerson("name",10,"12347");
        main.controller.createPerson("name3",18,"12341");
        System.out.println(main.controller.getPeople());
        main.controller.save();
        main.controller.clearList();
        System.out.println(main.controller.getPeople());
        main.controller.load();
        System.out.println(main.controller.getPeople());
        System.out.println(main.controller.getPeople().get(0).getAge());

        System.out.println(main.controller.getPeople().get(0).compareTo(main.controller.getPeople().get(1)));

        System.out.println(main.controller.getPeople());
        //Se le da una lista de personas, esa clase persona debe tener definido un criterio de comparacion
        //interno. La clase persona debe ser comparable
        Collections.sort(main.controller.getPeople());
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
