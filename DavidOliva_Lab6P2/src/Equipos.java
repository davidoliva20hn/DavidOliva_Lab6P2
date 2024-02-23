/*
 */

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Equipos {
    private String Nombre;
    private String País;
    private String Ciudad;
    private String Estadio;

    public Equipos() {
    }

    public Equipos(String Nombre, String País, String Ciudad, String Estadio) {
        this.Nombre = Nombre;
        this.País = País;
        this.Ciudad = Ciudad;
        this.Estadio = Estadio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaís() {
        return País;
    }

    public void setPaís(String País) {
        this.País = País;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    @Override
    public String toString() {
        return  País ;
    }
    
}
