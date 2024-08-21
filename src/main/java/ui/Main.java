package ui;

import control.PersonController;

import java.io.File;
import java.util.Arrays;

public class Main {
    private PersonController controller;
    public Main(){
        controller = new PersonController();
    }
    public static void main(String[] args){
       Main main = new Main();
       main.controller.createPerson("name",18,"12341");
       main.controller.save();
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
