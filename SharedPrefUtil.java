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
    
    public static void setIntPref(String key, int value) {
        getEditor().putInt(key, value).commit();
    }

    public static int getIntPref(String key, int defVal) {
        return getSharedPref().getInt(key, defVal);
    }

    public static void setFloatPref(String key, float value) {
        getEditor().putFloat(key, value).commit();
    }

    public static float getFloatPref(String key, float defVal) {
        return getSharedPref().getFloat(key, defVal);
    }

    public static void setLongPref(String key, long value) {
        getEditor().putLong(key, value).commit();
    }

    public static float getLongPref(String key, long defVal) {
        return getSharedPref().getLong(key, defVal);
    }

    public static void setStringSetPref(String key,  Set<String> value) {
        getEditor().putStringSet(key, value).commit();
    }

    public static Set<String> getStringSetPref(String key, Set<String> defVal) {
        return getSharedPref().getStringSet(key, defVal);
    }

    public Map<String, ?> getAll() {
        return getSharedPref().getAll();
    }

    public static void clear() {
        getEditor().clear().commit();
    }
}
