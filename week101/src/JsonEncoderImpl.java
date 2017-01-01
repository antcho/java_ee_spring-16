public class JsonEncoderImpl implements api.week1.JsonEncoder {

  public String toJson( String str ) {
    String jsonString = str.replace("\\", "\\\\");
    jsonString = jsonString.replaceAll("\"", "\\\\\"");

    return "\""+jsonString+"\"";
  }

  public String toJson( Number n ) {
    return String.valueOf(n.floatValue());
  }

  public String toJson( java.util.Map map ) {
    String ret = "{";
    boolean first = true;
    for( Object key : map.keySet() ) {
      if ( !first ) ret += ",";
      else first = false;
      Object value = map.get(key);
      if (value instanceof String){
        ret += "\""+key+"\": "+this.toJson((String)value);
      }else if (value instanceof Number){
        ret += "\""+key+"\": "+this.toJson((Number)value);
      }else{
        ret += "\""+key+"\": \""+value+"\"";
      }
    }
    return ret + "}";
  }

  public static void main(String args[]) {
    JsonEncoderImpl enc = new JsonEncoderImpl();
    java.util.Map<Object, Object> map = new java.util.HashMap<>();
    map.put("a", 12);
    map.put("b", "12");
    System.out.println("{\"a\": 12.0,\"b\": \"12\"}");
    System.out.println(enc.toJson(map));
  }
}
