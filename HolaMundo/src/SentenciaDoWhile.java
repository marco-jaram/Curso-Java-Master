
//Primero ejecuta despues prueba o evalua la condicino
// cuando necesitamos ejecutar una atarea antes de evaluar una condicion
//Hacer algo ientras sea verdadero jijij


public class SentenciaDoWhile {
    public static void main(String[] args) {

        boolean prueba = true;
        int  i =0;

        do {
            if ( i  == 10){
                prueba = false;
            }
            System.out.println(" i  =  " + i);
            i++;
        }
        while (prueba);

        System.out.println("Ya se detuvo mi chavo");

    }
}
