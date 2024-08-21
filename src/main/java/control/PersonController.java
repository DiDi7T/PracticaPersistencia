package control;

import com.google.gson.Gson;
import model.Person;

import java.io.*;
import java.util.ArrayList;

public class PersonController {

    private ArrayList<Person> people;

    private File data;
    private File listJson;
    public PersonController(){
        people = new ArrayList<>();
        File projectDir = new File(System.getProperty("user.dir"));
        //Si es en windows la separacion es C:\\Users\\user\\Documents\\
        //Si es Unix seria /home/user/Documents/

        this.data = new File(projectDir+"\\src\\main\\data");

        this.listJson = new File(data.getAbsoluteFile()+"\\people.json");
    }

    public void createResources() throws IOException {
        if(data.exists()){
            data.mkdir();
            if(listJson.exists()){
                listJson.createNewFile();
            }
        }
    }
    public void createPerson(String name, int age, String cc){
        Person person=new Person(name,age,cc);
        people.add(person);
    }

    public void save(){
        // el objeto que ayuda a la serializacion
        Gson gson = new Gson();
        //Formateo de la informacion (arrayList -> Json)
        String dataJson =gson.toJson(people);
        System.out.println(dataJson);

        try {
            // inicializar los recursos
            createResources();
            //Enlazar la informacion con el archivo
            FileOutputStream fos = new FileOutputStream(this.listJson);
            //Definir el escritor de la informacion
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
