import com.google.gson.Gson;
import java.io.Serializable;

public class SerializationManager {

    public static <T extends Serializable> void serialize(T object, String key, Class<T> type) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(object, type);
        SharedPrefUtil.setStringPref(key, jsonString);
    }

    public static <T extends Serializable> T deserialize(String key, Class<T> type) {
        T objectToReturn = null;
        Gson gson = new Gson();
        String jsonString = SharedPrefUtil.getStringPref(key, "");
        objectToReturn = gson.fromJson(jsonString, type);
        return objectToReturn;
    }
    
    public static void clear(String key) {
        SharedPrefUtil.clear();
    }
}
