public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"Marco", "Pedro", "Lucia", "Alicia"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
//            System.out.println(" nombres[i] = " + nombres[i]);
            if (nombres[i].equalsIgnoreCase("marco")
                    || nombres[i].equalsIgnoreCase("lucia")) {
                continue;
            }
            System.out.println(i + "._" + nombres[i]);


        }
        String[] nombres2 = {"Marco", "Pedro", "Lucia", "Alicia"};
        int count2 = nombres2.length;
        for (int i2 = 0; i2 < count2; i2++) {
            System.out.println(" nombres2[i2] = " + nombres2[i2]);
            if (nombres2[i2].equalsIgnoreCase("marco")) {
                continue;

            }

        }

    }
    }
