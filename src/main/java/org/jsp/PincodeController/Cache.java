package org.jsp.PincodeController;

public class Cache {
    private Jedis jedis;
    
    public Cache() {
        jedis = new Jedis("localhost", 6379);
    }
    
    public RouteResponse get(String fromPincode, String toPincode) {
        String key = fromPincode + "_" + toPincode;
        String cachedResponse = jedis.get(key);
        if (cachedResponse != null) {
            return gson.fromJson(cachedResponse, RouteResponse.class);
        }
        return null;
    }
    
    public void put(String fromPincode, String toPincode, RouteResponse response) {
        String key = fromPincode + "_" + toPincode;
        String json = gson.toJson(response);
        jedis.set(key, json);
    }
}