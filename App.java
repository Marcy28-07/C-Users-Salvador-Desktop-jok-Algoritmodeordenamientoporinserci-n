public class App {
public static void insertionSort(int[] arr) {
    int n= arr.length;
    for (int i = 1; i < n; i++){
        int key = arr[i];//Seleccionamos el elemento a insertar en su posicion correcta
        int j= i - 1 ;
        //Movemos los elementos mayores a key a una posición adelante de swu posición
       //actual
       while (j >= 0 && arr [j] > key) {
        arr [j+1] = arr[j];
        j--;
    
    }
    arr[j+1]= key; // Insertamos key en su posición correcta

    }


    }

    public static void main(String[]args)throws Exception {
        System.out.println("Hello, world!, metodo de ordenamiento por inserción");

        int[]arr = {12,11,13,5,6};

        System.out.println("Arreglo opriginal:");
        for (int num : arr){
            System.out.println(num + "");


        }

        System.out.println();
        System.out.println("=====");
        insertionSort(arr);//Llamada al metodo de ordenamiento por inserción

        System.out.println("Arreglo ordenado");
        for(int num:arr){
            System.out.println(num + "");



        }





    

    }
    }

