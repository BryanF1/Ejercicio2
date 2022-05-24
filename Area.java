package proyecto.src.clase2;

public class Area {
    private String tiempo;
    private double costo;
    private Maestro maestro;
    private Alumno alumno;
    private String institucion;
    
    Area(String tiem, double costo, String inst, Maestro maes, Alumno alum)
    {
      setTiempo(tiem);
      setCosto(costo);
      setInstitución(inst);
      setMaestro(maes);
      setAlumno(alum);
    }

    void setTiempo(String tiem)
    {
        this.tiempo = tiem;
    }

    String getTiempo()
    {
      return tiempo;
    }
    void setCosto(double costo)
    {
        this.costo= costo;
    }

    double getCosto()
    {
      return costo;
    }
    void setMaestro(Maestro maes)
    {
        this.maestro= maes;
    }

    Maestro getMaestro()
    {
      return maestro;
    }
    
    void setAlumno(Alumno alum)
    {
        this.alumno= alum;
    }

    Alumno getAlumno()
    {
      return alumno;
    }
    void setInstitución(String inst)
    {
        institucion=inst;
    }

    String getInstitucion()
    {
        return institucion;
    }



}

