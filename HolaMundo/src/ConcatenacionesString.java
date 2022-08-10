public class ConcatenacionesString {
    public static void main(String[] args) {
        String curso = " Curso de Filosofia";
        String profesor = "Marco";
        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println((numeroA + numeroB) + detalle);

        String detalle2 = curso.concat(" con " + profesor);
        System.out.println("detalle2 = " + detalle2);
        String a = "a";
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i <500; i++){
            sb.append(a);
        }
        System.out.println("sb.toString() = " + sb.toString());
    }
}
