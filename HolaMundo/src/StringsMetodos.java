import javax.lang.model.SourceVersion;

public class StringsMetodos {
    public static void main(String[] args) {
        String nombre = "Marco";
       String no = String.valueOf(nombre.charAt(1));
        System.out.println("no = " + no);
//         System.out.println("nombre.length = " + nombre.length());
//        System.out.println(nombre.charAt(1));
//        System.out.println(nombre.charAt(4));

        System.out.println(nombre.substring(1));  //desde la primero posicion de Marco
        System.out.println(nombre.substring(2,3));
        System.out.println(nombre.substring(nombre.length()-1)); //obteniendo el ultimo caracter
String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"X\") = " + trabalenguas.replace("a", "X"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lengua\") = " + trabalenguas.contains("lengua"));

        String  archivo = "mi_imagen.jpge";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));

        String margarita = "Margarita";
        String  luc ="Lucia";
        String lalo= "Eduardo";
        String marg = String.valueOf(margarita.charAt(1));
        String a = marg.toUpperCase();
        String b = margarita.substring(margarita.length()-2);

        String lu = String.valueOf(luc.charAt(1));
        String a2 = lu.toUpperCase();
        String b2 = luc.substring(luc.length()-2);

        String la = String.valueOf(lalo.charAt(1));
        String a3 = la.toUpperCase();
        String b3 = lalo.substring(lalo.length()-2);



        System.out.println("b = " + a + "." + b + "_" + a2 + "." + b2 + "_" + a3 + "." + b3);
        


    }
}
