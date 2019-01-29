import com.google.gson.Gson;
import java.io.Serializable;

public class SerializationManager {

    public static <T extends Serializable> void serialize(T object, String key, Class<T> type) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(object, type);
        YourApp.getContext().getSharedPreferences(sharedPrefenceName, Context.MODE_PRIVATE).edit().putString(key, jsonString).commit();
    }

    public static <T extends Serializable> T deserialize(String key, Class<T> type) {
        T objectToReturn = null;
        Gson gson = new Gson();
        String jsonString = YourApp.getContext().getSharedPreferences(sharedPrefenceName, Context.MODE_PRIVATE).getString(key, "");
        objectToReturn = gson.fromJson(jsonString, type);
        return objectToReturn;
    }
}
