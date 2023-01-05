import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("data.dat");
        ArrayList<Auto> arr;

        //pokud existuje soubor precte co je v tom souboru
        //(Arraylist ktery jsem pouzil pri minulem spusteni)
        //a potom to ulozi do Arraylistu, ktery pouzivam ted
        if(file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //precte soubor a ulozi ho do nove vitvoreneho pole
            arr = (ArrayList<Auto>) ois.readObject();
            System.out.println(arr);
        }
        //pokud soubor neexistuje vytvori nove pole objektu Auto
        else {
            arr = new ArrayList<Auto>();
        }

        Auto a = new Auto();

        arr.add(a);

        //deklaruji si output
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //zapise pole co pouzivam ted do souboru
        oos.writeObject(arr);

        oos.close();
    }
}