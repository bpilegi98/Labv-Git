public class Main
{
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Bianca","Pilegi",21);
        Persona p2 = new Persona ("Juan","Luduena",22);
        Persona p3 = new Persona ("Toribio","Erizo", 42);

        /*
        System.out.println(p1.compareTo(p2));

        System.out.println(p2.compareTo(p2));

        System.out.println(p3.compareTo(p2));

        */

        Pila pila = new Pila();

        pila.push(p1);
        pila.push(p3);
        pila.push(p2);

        System.out.println(pila);

        System.out.println(pila.pop());

        System.out.println(pila.size());


    }
}
