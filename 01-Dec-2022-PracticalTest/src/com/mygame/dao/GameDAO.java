package com.mygame.dao;

public class GameDAO {
  static String cityName[]={"Chennai","Mumbai","Delhi","Kolkata","Hyderabad"};
   
public void getcityName() {
	for(int i=0;i<cityName.length;i++) {
		System.out.println(cityName[i]);
	}
	
}
}
