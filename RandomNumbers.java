import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)
        int[][] array = new int[100][10];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = randomNumber();
            }
        }
        print2DArray(array);
    }

    /**
     * Function name: randomNumber
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    /**
     * Function name: print2DArray
     * 
     * @param integers (2D array int)
     * 
     * Inside the function:
     * 1. nested loop that prints a 2D array using the randomNumber function
     */
    public  static void print2DArray(int[][]  integers) {
        for (int[] integer : integers) {
            for (int i : integer) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}