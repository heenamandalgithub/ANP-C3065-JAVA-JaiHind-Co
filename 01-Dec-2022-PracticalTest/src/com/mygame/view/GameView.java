package com.mygame.view;

import com.mygame.service.*;
import java.util.Random.*;

public class GameView {
	GameService gaming=new GameService();
	String[] displaycityNameWithBlanks()
	{
		String[] s =gaming.getcityNameService();
		for(int i=0;i<s.length;i++)
		{
			char arr[]=s[i].toCharArray();
			
			for(int j=0;i<arr.length;j++)
			{
				 arr[i]=(char) (arr.length*Math.random());	
		}
	}
		return s;
	}
}
