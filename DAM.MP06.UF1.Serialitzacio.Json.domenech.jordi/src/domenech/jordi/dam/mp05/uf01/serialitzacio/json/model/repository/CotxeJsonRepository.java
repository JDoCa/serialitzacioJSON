// CotxeJsonRepository.java
package domenech.jordi.dam.mp05.uf01.serialitzacio.json.model.repository;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import domenech.jordi.dam.mp05.uf01.serialitzacio.json.model.domain.Cotxe;

public class CotxeJsonRepository {

    private CotxeJsonRepository() {

    }

    public static CotxeJsonRepository getInstance() {
        if (instance == null) {
            instance = new CotxeJsonRepository();
        }

        return instance;
    }

    private static CotxeJsonRepository instance = null;

    public String getJsonString(Cotxe cotxe) {
        Gson gson = new Gson();
        return gson.toJson(cotxe);
    }

    public Cotxe getCotxeFromJson(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, Cotxe.class);
    }

    public String getJsonString(Cotxe[] cotxes) {
        Gson gson = new Gson();
        return gson.toJson(cotxes);
    }

    public Cotxe[] getArrayCotxesFromJson(String jsonString) {
        Type arrayCotxesType = new TypeToken<Cotxe[]>() {
        }.getType();
        Gson gson = new Gson();
        return gson.fromJson(jsonString, arrayCotxesType);
    }
}
