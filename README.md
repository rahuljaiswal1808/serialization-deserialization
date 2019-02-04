# serialization-deserialization

Using this class, one can doserialization and deserialization just by using one line:

# Serialization:
SerializationManager.serialize(jsonString, KEY_STRING, POJO_NAME.class);
  
# Deserialization
POJO_NAME object = SerializationManager.deserialize(KEY_STRING, POJO_NAME.class);


# Shared Preferance Utility


# Set Shared Pref

SharedPrefUtil.setStringPref(key, value);</BR>
SharedPrefUtil.setBoolPref(key, value);</BR>
SharedPrefUtil.setIntPref(key, value);</BR>
SharedPrefUtil.setFloatPref(key, value);</BR>
SharedPrefUtil.setLongPref(key, value);</BR>
SharedPrefUtil.setStringSetPref(key, value);</BR>

# Get Shared Pref

SharedPrefUtil.getStringPref(key, defVal);</BR>
SharedPrefUtil.getBoolPref(key, defVal);</BR>
SharedPrefUtil.getIntPref(key, defVal);</BR>
SharedPrefUtil.getFloatPref(key, defVal);</BR>
SharedPrefUtil.getLongPref(key, defVal);</BR>
SharedPrefUtil.getStringSetPref(key, defVal);</BR>
SharedPrefUtil.getAll();</BR>
