package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService {
public void getcityNameService()
{
	GameDAO GameDAOobj=new GameDAO();
	GameDAOobj.getcityName();
}
}
