package proyecto.src.clase2;

public class Main {
    public static void main(String args[])
    {
        Area area = new area("2h 30min",128.4,"colegio Max Plack");

        System.out.println(area.getTiempo());
        System.out.println(area.getCosto());
        System.out.println(area.getInstitucion());
       

        area.setMaestro(new Maestro("Fernando", "Rmirez"));
        System.out.println("nombre del docente: "+area.getMaestro().getNombres());
        System.out.println("apellido del docente; "+area.getMaestro().getApellido());

        area.setAlumno(new Alumno("Pedro", 98164563));
        System.out.println("nombre del alumno: "+area.getAlumno().getNombres());
        System.out.println("codigo del alumno: "+area.getAlumno().getCodigo());
       
    }
    
}

