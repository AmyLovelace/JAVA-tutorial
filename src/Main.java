public class Main {

    public static void main(String[] args) {

        /* auto suma*/
        int a = 3;
        a += 2;
        /*  auto multiplicacion */
        a *= 5;
        /*auto division*/
        a /= 5;
        System.out.println(a);

        /*precedencia de uso de parentesis*/

        System.out.println(3 + 2 * 5);
        System.out.println((3 +2) * 2);
        System.out.println(3 + (2 * 2));
        System.out.println(4*3+5%2*6);
        System.out.println(4*(3+5)%(2*6));

        /* declarar variable*/
        int z;
        /* asignar valor a variable*/
        z=3;

        /*declarar y asignar variable*/
        int b=4;

        /*declarar varias variables de distintos tipo*/
        int d, f, c;
        d=2;
        f=3;
        c=4;
        /*ejercicio de operadores de asignacion escribe un programa que declare una variable llamada value
        con un valor inicial de 3 , utiliza los operadores de asignacion para hacer estas operaciones sobre la propia
        variable,mostrando el resultado parcial acumulado tras cada operacion: sumarle 5, multiplicarla por 4 y
        dividirla en 2 */

        int value = 3;
        System.out.println(value);
        value += 5;
        System.out.println(value);
        value *= 4;
        System.out.println(value);
        value /= 2;
        System.out.println(value);




        /*ejercicio almacena una variable tu año de nacimiento y el año actual y despues las utilice
        para sacar por pantalla cuantos años han pasado desde que naciste*/

        int yearOfbirth = 1994;
        int currentYear = 2023;

        System.out.println("han pasado "+(currentYear - yearOfbirth)+" años desde que naciste");

        byte edad =30;
        short km = 3000;
        int saldo = 2500000;
        long poblacion = 292020202;

        /* haz un programa que almace en variable
        * una temperatura en grados cenrtigrados -5c
        * el numero de unas paginas de un libro 364
        * el numero de habitantes 3124664
        * la pobracion mundial 7132123733*/

        byte haceFrio = -5;
        System.out.println( haceFrio + " grados Celsius");

        short cuantasPaginasquedan = 364;
        System.out.println("te quedan " + cuantasPaginasquedan+ " paginas para terminar el libro");

        int habitantes = 3124664;
        System.out.println("hay "+habitantes+" habitantes en Chile");

        long poblacionMundial = 713212373;
        System.out.println("hay "+poblacionMundial + " personas en el mundo");


        /*tipos de numeros con decimales*/

        float num1 = 3.14159F;
        double num2 = 3.141592654;

        System.out.println(num1);
        System.out.println(num2);

        /*haz un programa que almacene en dos variables el precio de dos articulos de una tienda en dolares con centavos y
        * muestre por pantalla la suma de ambos*/


        float seitan = 3.99f;
        float tempeh =5.99f;
        float sumaTempehYseitan = seitan +tempeh;

        System.out.println("seitan y tempeh el total seria $" + sumaTempehYseitan + " dolares");










    }



}