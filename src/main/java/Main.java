import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        try (
             FileReader fileReader = new FileReader("src/main/resources/Data/numeros.txt");
             BufferedReader bufferReader = new BufferedReader(fileReader)
        ) {
            Integer[] arr = new Integer[3000];
            int pos = 0;

            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] datos = line.trim().split(" ");

                for (int i = 0; i < datos.length; i++) {
                    if (!datos[i].isEmpty()) {
                        arr[pos] = Integer.parseInt(datos[i]);
                        pos++;
                    }
                }
            }

            System.out.println("Se cargaron " + pos + " numeros.");

            Integer[] arrParaGnome = arr.clone();
            sorter.gnomeSort(arrParaGnome);
            sorter.gnomeSort(arrParaGnome);

            Integer[] arrParaInsertion = arr.clone();
            sorter.insertionSort(arrParaInsertion);
            sorter.insertionSort(arrParaInsertion);

            Integer[] arrParaMerge = arr.clone();
            sorter.mergeSort(arrParaMerge);
            sorter.mergeSort(arrParaMerge);

            Integer[] arrParaQuick = arr.clone();
            sorter.quickSort(arrParaQuick);
            sorter.quickSort(arrParaQuick);

            Integer[] arrRadix = arr.clone();
            int[] arrParaRadix = new int[pos];
            for (int i = 0; i < pos; i++) {
                arrParaRadix[i] = arrRadix[i];
            }
            sorter.radixSort(arrParaRadix);
            sorter.radixSort(arrParaRadix);

            System.out.println("Ordenamiento terminado.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}