# serialization-deserialization

Using this class, one can doserialization and deserialization just by using one line:

# Serialization:
SerializationManager.serialize(jsonString, KEY_STRING, POJO_NAME.class);
  
# Deserialization
POJO_NAME object = SerializationManager.deserialize(KEY_STRING, POJO_NAME.class);


# Shared Preferance Utility


# Set Shared Pref

SharedPrefUtil.setStringPref(key, value);
SharedPrefUtil.setBoolPref(key, value);
SharedPrefUtil.setIntPref(key, value);
SharedPrefUtil.setFloatPref(key, value);
SharedPrefUtil.setLongPref(key, value);
SharedPrefUtil.setStringSetPref(key, value);

# Get Shared Pref

SharedPrefUtil.getStringPref(key, defVal);
SharedPrefUtil.getBoolPref(key, defVal);
SharedPrefUtil.getIntPref(key, defVal);
SharedPrefUtil.getFloatPref(key, defVal);
SharedPrefUtil.getLongPref(key, defVal);
SharedPrefUtil.getStringSetPref(key, defVal);
SharedPrefUtil.getAll();
