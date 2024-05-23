package universidad.maraton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

class EquipoProgramacion extends Equipo implements EquipoConstantes {
    private Collection<String> programadores;

    public EquipoProgramacion(String nombreEquipo, String universidad, String lenguajeProgramacion, int tamanoEquipo) {
        super(nombreEquipo, universidad, lenguajeProgramacion, tamanoEquipo);
        this.programadores = new ArrayList<>();
    }

    public void anadirProgramador(String nombre, String apellido) throws Exception {
        if (programadores.size() >= MAX_PROGRAMADORES) {
            throw new Exception("El equipo ya está lleno");
        }
        validarNombreApellido(nombre);
        validarNombreApellido(apellido);
        programadores.add(nombre + " " + apellido);
        setTamanoEquipo(programadores.size());
    }

    public Collection<String> listarProgramadores() {
        return programadores;
    }

    @Override
    public boolean equipoCompleto() {
        return programadores.size() >= MIN_PROGRAMADORES;
    }

    private void validarNombreApellido(String nombre) throws Exception {
        if (!Pattern.matches("[a-zA-Z]+", nombre)) {
            throw new Exception("Nombre o apellido inválido: " + nombre);
        }
    }
}

