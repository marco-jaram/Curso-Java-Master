public class StringEjemplo {
    public static void main(String[] args) {
        String curso = "Programacion en java";
        String curso2 = new String("Programacion en java2 es otra forma de demostrar que string es un objeto");
        boolean esIgual = curso == curso2;
        System.out.println(esIgual);
        esIgual = curso.equals(curso2);
        System.out.println("comparando desde .equals es  " + esIgual);

    }
}
