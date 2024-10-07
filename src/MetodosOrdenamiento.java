import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: Devuelve un arreglo vacio, lo cual al llamarlo, nos sale un arreglo vacio.
    //Para corregirlo se debe retornar el arreglo ordenado. Linea : 22
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: El arreglo se imprime de mayor a menor, el objetivo es imprimir de menor a mayor, por ello se modifica 
    //el condicional: Linea 35 modificada

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Intercambio de elementos
                if (arreglo[i] > arreglo[j]) {
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: En los bucles for, precisamente el segundo, la variable j empezaba desde 0, eso descencadenaba  que sobrepase el 
    //el tamaño del arrreglo, para corregirlo debemos igualar j a  i + 1 para que se compare con el siguiente numero : LINEA 60
    //Segundo Error: El condicionar comparaba ambas posiciones, arreglo [j]  > arreglo [j], para corregirlo debemos cambiar una a i : LINEA 61
    //Tercer error: El intercambio de numeros salia error porque se aunmetaba +1 a la j, lo que ocasiona que se salga del tamaño del array.
    //Solucion: Eliminar el +1  :  LINEA 63 AL 65
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n  ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }


    // Método de selección con errores
    // Error encontrado: No devolvia un tipo de dato, es un metodo que no es void, por lotanto es necesario un return. Se devuelve arreglo
    //LINEA: 91
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: En el primer for, el bucle recorre todo el array pasandose del limite, recordemos que seleccion analiza todos 
    //los elementos del array, pero no los compara con el primero, ni con mas elementos que lo sobrepasen. Por ello se debe agregar un -1.
    //LINEA 102
    //Error 2: En el siguiente bucle, el condicional j disminuye en vez de aunmentar, lo que no es el objetivo del metodo de ordenamiento. 
    //Para corregirlo debemos poner j++: LINEA 104
    public int[] seleccionSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length -1 ; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Cuando se termina el segundo bucle for, el intercambio de elementos no es funcional, debido a que asignamos el numero
    //menor a la posicion i. Para corregir debemos asignar smallNumber segun el indiceMinimo
    //De igual manera el arreglo[indiceMinimo], estamos modificando el la posicion del arreglo, con el smallNumber cuando ya lo cambiamos por 
    //arreglo[i], para corregirlo debemos intercambiar la posicion i con smallNumber
    //LINEA 136 A 138
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Se imprime de mayor a menor, debemos revertir el condicional de menor que a mayor que o igual en el while,
    //i mayor o igual a 0, y tambien arreglo[i] > key : LINEA 153
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;
            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];

                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: El el segundo condicionar for, las variables usadas en la comparacion es j, cuando no es asi, se debe utilizar la 
    //variable i, ademas de que el bucle se estaba aunmentado segun la variable j, lo cual no tiene sentido. Debe disminuir segun I.
    //Error 2: Dendor del bucle con errores, esta asignandose la variable arreglo[j + 1] = arreglo[j], lo que e quiere es cambiar la posicion
    //segun i. Correcion: cambiar todas las variables del bucle y dentro del bucle por i. Linea 174 a 175
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];
            int i = j - 1;
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: 
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
