package com.formation.blog.controllers;

import javax.servlet.http.Cookie;

public class cookiesManager {
	public static Cookie getCookie(String name, Cookie[] cookies)
	{
		Cookie cookie = null;
		if (cookies != null) {
			
		
		for (int i = 0 ; i < cookies.length ; i++)
		{
			if (cookies[i].getName().equals(name))
			{
				cookie = cookies[i];
				break;
			}
		}
		}
		
		return cookie;
	}
	
	public static boolean estConnecte(Cookie[] cookies)
	{
		Cookie c = getCookie("user", cookies);
		
		if (c == null)
			return false;
		else
		{
			String value = c.getValue();
			try {
				int i = Integer.valueOf(value);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
			
	}
	
	public static Cookie login(Cookie[] cookies, String user_id)
	{
		Cookie c = getCookie("user", cookies);
		
		if (c == null)
		{
			c = new Cookie("user", user_id);
			c.setMaxAge(15 * 60);
		}
		else
		{
			c.setValue(user_id);
			c.setMaxAge(15 * 60);
		}
		
		return c;
	}
	
	public static Cookie logout(Cookie[] cookies)
	{
		Cookie c = getCookie("user", cookies);
		
		if (c == null)
		{
			
		}
		else
		{
			c.setMaxAge(0);
		}
		
		return c;
	}
}

