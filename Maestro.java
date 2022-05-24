package proyecto.src.clase2;

public class Maestro {
    private String nombre;

    private String apellido;

    Maestro(String nom, String ape)
{
    setNombre(nom);
    setApellido(ape);
  
    
    
}
    void setNombre(String nom)
    {
        this.nombre= nom;
    }

    String getNombres()
    {
      return nombre;
    }

    void setApellido(String ape)
    {
        apellido = ape;
    }
    String getApellido()
    {
        return apellido;
    }
   
    
}

