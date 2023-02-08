import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {

    public void CreateFile(){
        try {
            File myObj = new File("data.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("ERROR.");
            e.printStackTrace();
        }
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public ArrayList<Integer> DataGenerator(int max){
        ArrayList<Integer> RandomNumbers = new ArrayList<Integer>();
        for (int i = 0; i<max;i++){
            RandomNumbers.add(getRandomNumber(0, 3000));
        }
        return RandomNumbers;
    }

    public void WriteFile(ArrayList<Integer> data){
        try {
            FileWriter writer = new FileWriter("data.txt");
            for (Integer num: data){
                writer.write(num.toString()+System.lineSeparator());
            }
            writer.close();
        }catch (IOException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> ReadFile() throws FileNotFoundException {
        Scanner s = new Scanner(new File("data.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (s.hasNext()){
            int value = Integer.valueOf(s.next());
            list.add(value);
        }
        s.close();
        return list;
    }
}
