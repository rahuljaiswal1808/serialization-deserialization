# serialization-deserialization

Using this class, one can doserialization and deserialization just by using one line:

# Serialization:
SerializationManager.serialize(jsonString, KEY_STRING, POJO_NAME.class);
  
# Deserialization
POJO_NAME object = SerializationManager.deserialize(KEY_STRING, POJO_NAME.class);
