package com.FeedAutomation;

import java.net.HttpURLConnection;
import java.net.URL;

public class ReadMainFeed {

	
	
	public static void main(String[] args) {
	
		// code to send pid to the the function

	}

	
	public static void checkPid(String pid)
	{
		int res;
		String feedip = "";
		URL memcacheUrl = new URL("http://" + feedip + "/caching/service/get?namespace=DALFeedsjabong&key=1_pid");
		HttpURLConnection huc = null;
		huc = (HttpURLConnection)  memcacheUrl.openConnection();
		huc.setRequestMethod("GET");
         huc.connect();
         res = huc.getResponseCode();
		
		
	}
}
