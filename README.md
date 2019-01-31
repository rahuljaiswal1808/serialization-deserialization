# serialization-deserialization

Using this class, one can doserialization and deserialization just by using one line:

#Serialization:
SerializationManager.serialize(jsonString, KEY_STRING, <POJO>.class);
  
#Deserialization
POJO pojo = SerializationManager.deserialize(KEY_STRING, <POJO>.class);
