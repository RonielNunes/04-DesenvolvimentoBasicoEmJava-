package trabalhandoComArrays;

public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = {1,2,3,4,5};

        System.out.println("Tamanho do array: " + array.length + " array2 " + array2.length);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }

        int [][] matriz = new int[2][2];
        int [][] matriz2 = {{1,2,3},{4,5,6}};
        System.out.println();
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j =  0; j< matriz[i].length; j++){
                matriz[i][j] = i+j;
                System.out.print(matriz[i][j]+ " ");
            }
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++){
            System.out.println();
            for (int j =  0; j< matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
        }
    }
}
