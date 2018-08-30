package com.utec.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CiudadesRepository {

	private static CiudadesRepository repository = new CiudadesRepository();
    private HashMap<String, Ciudad> ciudades = new HashMap<>();

    public static CiudadesRepository getInstance() {
        return repository;
    }

    private CiudadesRepository() {
        saveCiudad(new Ciudad("Montevideo", "Uruguay",0x7f020056));
        saveCiudad(new Ciudad("Buenos Aires", "Argentina",0x7f020054));
        saveCiudad(new Ciudad("Brasilia", "Brasil",0x7f020053));
        saveCiudad(new Ciudad("Maracaibo", "Venezuela",0x7f020055));
    }

    private void saveCiudad(Ciudad ciudad) {
        ciudades.put(ciudad.getId(), ciudad);
    }

    public List<Ciudad> getCiudades() {
        return new ArrayList<>(ciudades.values());
    }
}

