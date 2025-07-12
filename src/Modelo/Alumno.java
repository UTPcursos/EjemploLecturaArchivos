package Modelo;

public class Alumno {
    private String nombre;
    private int edad;
    private String sexo;
    private String correo;
    private String celular;
    private String carrera;
    private String ciclo;

    public Alumno(String nombre, int edad, String sexo, String correo, String celular, String carrera, String ciclo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.correo = correo;
        this.celular = celular;
        this.carrera = carrera;
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return String.format("%-40s %6d %5s %30s %13s %30s %5s",
                nombre, edad, sexo, correo, celular, carrera, ciclo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

}
