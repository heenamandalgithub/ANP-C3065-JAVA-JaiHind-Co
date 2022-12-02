package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService {
public String[]  getcityNameService()
{
	GameDAO GameDAOobj=new GameDAO();
	GameDAOobj.getcityName();
	String s[]=GameDAOobj.getcityName();
	return s;
}
}
