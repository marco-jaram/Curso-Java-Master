//Ejecutar un bloque mientras se cumpla

public class SentenciaWhile {
    public static void main(String[] args) {
        int i =3;

        while ( i <= 5){
            System.out.println("i = " + i);
            i++;
        }
i =0;
        boolean prueba = true;

        while (prueba){
            if ( i == 7){
                prueba = false;
            }
            System.out.println(i);
            i++;
        }


    }
}
