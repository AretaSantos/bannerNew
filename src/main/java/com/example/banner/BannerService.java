package com.example.banner;

import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class BannerService {
	
	 public static JSONObject urlToJson(String urlString) throws URISyntaxException {
		 
	        URI uri = new URI(urlString);
	        //System.out.println(uri);
	        String query = uri.getQuery();
	        String[] pairs = query.split("&");

	        JSONObject json = new JSONObject();
	        for (String pair : pairs) {
	            int idx = pair.indexOf("=");
	            String key = pair.substring(0, idx);
	            String value = pair.substring(idx + 1);
	            json.put(key, value);
	
	        }
	        return json;
	    }

	}

