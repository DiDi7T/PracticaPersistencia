package control;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Person;

import java.io.*;
import java.lang.reflect.Type;
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

    public void clearList(){
        people.removeAll(people);
    }
    public ArrayList<Person> getPeople(){
        return people;
    }

//    public void save(){
//        // el objeto que ayuda a la serializacion
//        Gson gson = new Gson();
//        //Formateo de la informacion (arrayList -> Json)
//        String dataJson =gson.toJson(people);
//        //System.out.println(dataJson);
//
//        try {
//            // inicializar los recursos
//            createResources();
//            //Enlazar la informacion con el archivo
//            FileOutputStream fos = new FileOutputStream(this.listJson);
//            //Definir el escritor de la informacion
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
//
//            //Escribir la informacion
//            writer.write(dataJson);
//            //Linpiar buffer
//            writer.flush();
//            //Cerrar el buffer
//            writer.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//    public void load(){
//        Gson gson =new Gson();
//
//        try {
//            FileInputStream fis =new FileInputStream(this.listJson);
//            //lector
//            BufferedReader reader =new BufferedReader(new InputStreamReader(fis));
//            //Como lo voy a leer
//            String line ="";
//            String data = "";
//
//            while ( (line = reader.readLine()) != null){
//                data += line;
//            }
//            reader.close();
//
//            Type listType = new TypeToken<ArrayList<Person>>(){}.getType();
//            people = gson.fromJson(data, listType);
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public ArrayList<Person> selectionSort(ArrayList<Person> toSort){
        int n =toSort.size();
        for (int i=0;i<n-1;i++){
            for (int j=i+1; j<n;j++){
                if (toSort.get(i).compareTo(toSort.get(j))>0){
                    Person prev =toSort.get(i);
                    Person current =toSort.get(j);

                    toSort.set(i, current);
                    toSort.set(j,prev);
                }
            }
        }
        return  toSort;
    }

    public ArrayList<Person> insertionSort(ArrayList<Person> toSort){
        int n =toSort.size();
        for (int i=1;i<n;i++){
            Person current = people.get(i);
            int j=i-1;
            while (j >=0 && current.compareTo(toSort.get(j))<0){
                toSort.set(j+1, toSort.get(j));
                --j;
            }
            toSort.set(j+1, current);
        }
        return  toSort;
    }
}
