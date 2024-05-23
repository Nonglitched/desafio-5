package universidad.maraton;

abstract class Equipo {
    private String nombreEquipo;
    private String universidad;
    private String lenguajeProgramacion;
    private int tamanoEquipo;

    public Equipo(String nombreEquipo, String universidad, String lenguajeProgramacion, int tamanoEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.tamanoEquipo = tamanoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    public void setTamanoEquipo(int tamanoEquipo) {
        this.tamanoEquipo = tamanoEquipo;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombreEquipo + ", Universidad: " + universidad + ", Lenguaje: " + lenguajeProgramacion + ", Tamaño: " + tamanoEquipo;
    }
}
