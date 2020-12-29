
package AlumnosPaquetePkg;
import javax.xml.bind.annotation.*;
@XmlRootElement
public class Alumno {
    private int id;
 private String nombre;
 private int curso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
 
 public Alumno()
 {
 // costructor por defecto
 id = 0;
 nombre = "defecto";
 curso = 0;
 }
  public Alumno(int pid, String pnombre, int pcurso)
 {
 this.id = pid;
 this.nombre = pnombre;
 this.curso = pcurso;
 }
@Override
 public String toString() {
 return new StringBuffer(" id: ").
 append(id).
 append(" nombre: ").
 append(nombre).
 append(" curso: ").
 append(curso).toString();
 }
}
