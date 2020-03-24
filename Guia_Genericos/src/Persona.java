public class Persona implements Comparable
{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int compareTo(Object o) //retorna 1 en caso de que sea mayor, 0 igual, -1 menor, -2 error
    {
        if(o instanceof Persona)
        {
            Persona p = (Persona) o;
            if (this.edad < p.edad) {
                return 1;
            } else {
                if (this.edad > p.edad) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
        else
        {
            return -2;
        }
    }

    public String toString()
    {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Edad: " + getEdad();
    }
}
