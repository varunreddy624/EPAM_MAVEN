package com.varunreddy.sweets;

import java.util.Comparator;

public class SortSweetWeight implements Comparator<Sweet>
{
	public int compare(Sweet a,Sweet b)
	{
		if(a.getWeight() - b.getWeight()>0)
		{
			return 1;
		}
		else if(a.getWeight() - b.getWeight()<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
