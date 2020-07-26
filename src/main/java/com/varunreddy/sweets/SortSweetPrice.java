package com.varunreddy.sweets;

import java.util.Comparator;

public class SortSweetPrice implements Comparator<Sweet>
{
	public int compare(Sweet a,Sweet b)
	{
		if(a.getPrice() - b.getPrice()>0)
		{
			return 1;
		}
		else if(a.getPrice() - b.getPrice()<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
