import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Controller c = new Controller();
        GnomeSort gnomeSort = new GnomeSort();
        int qty = 0;
        int[] rawData;
        int[] fileData;
        System.out.println("Bienvenido al programa de ordenamiento de datos");
        while (true) {
            System.out.println("Ingrese la cantidad de datos que desea generar");
            String str = input.next();
            try {
                qty = Integer.parseInt(str);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Ingrese un numero entero");
            }
        }
        c.CreateFile();
        rawData = c.DataGenerator(qty);
        c.WriteFile(rawData);
        fileData = c.ReadFile();
        gnomeSort.gnomeSort(fileData, fileData.length);
        for (int i = 0; i<fileData.length;i++){
            System.out.println(fileData[i]);
        }
    }
}