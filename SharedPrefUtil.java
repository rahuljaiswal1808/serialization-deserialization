import android.content.SharedPreferences;

public class SharedPrefUtil {

    private static SharedPreferences getSharedPref() {
        return YourApp.getInstance().getSharedPreferences(Constants.APP_PREF, Constants.PRIVATE_MODE);
    }

    private static SharedPreferences.Editor getEditor() {
        return getSharedPref().edit();
    }

    public static void setStringPref(String key, String value) {
        getEditor().putString(key, value).commit();
    }

    public static String getStringPref(String key, String defVal) {
        return getSharedPref().getString(key, defVal);
    }

    public static void setBoolPref(String key, boolean value) {
        getEditor().putBoolean(key, value).commit();
    }

    public static boolean getBoolPref(String key, boolean defVal) {
        return getSharedPref().getBoolean(key, defVal);
    }

    public static void clear() {
        getEditor().clear().commit();
    }
}
