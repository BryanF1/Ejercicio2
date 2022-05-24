package proyecto.src.clase2;

public class Alumno {
    private String nombres;

    private int codigoAlumnos;



    Alumno(String nom, int codigo)
{
    setNombre(nom);
    setCodigo(codigo);
    
}
    void setNombre(String nom)
    {
        this.nombres= nom;
    }

    String getNombres()
    {
      return nombres;
    }

    void setCodigo(int codigo)
    {
        codigoAlumnos = codigo;
    }
    int getCodigo()
    {
        return codigoAlumnos;
    }
    
}

