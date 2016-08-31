package algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;

abstract class MapSort implements Comparator<Entry<String, Integer>>
{	

}

class MapSort1 implements Comparator<Entry<String, Integer>>
{

	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if(o1.getValue() > o2.getValue())
			return 1;
		if(o1.getValue() == o2.getValue())
			return 0;			
		return -1;
	}	

}

class AsendingMapSort  extends MapSort
{
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			if(o1.getValue() > o2.getValue())
				return 1;
			if(o1.getValue() == o2.getValue())
				return 0;			
			return -1;
	}
}

class DesendingMapSort  extends MapSort
{

	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		if(o1.getValue() < o2.getValue())
			return 1;
		if(o1.getValue() == o2.getValue())
			return 0;			
		return -1;
	}
	
}

public class WordCounter {
	
	private String input;
	private HashMap<String,Integer> wordMap = new HashMap<String,Integer>();
	private ArrayList<Entry<String, Integer>> sortedList = new ArrayList<Entry<String, Integer>>();
	
	
	public WordCounter(String input) {
		super();
		this.input = input;
		this.wordMap = count();
		this.sortedList.addAll(this.wordMap.entrySet());
		Collections.sort(this.sortedList, new AsendingMapSort());	
		
		
	}
	
	public HashMap<String,Integer> print()
	{
		return this.wordMap;
	}
	
	public String Top()
	{		
		return this.sortedList.get(this.sortedList.size()-1).getKey();
	}
	
	public String bottom()
	{		
		return this.sortedList.get(0).getKey();
	}
	
	
	private HashMap<String,Integer> count()
	{
		StringBuilder str = new StringBuilder();
		for (Character c : this.input.trim().toLowerCase().toCharArray())
		{
			if (Character.isWhitespace(c))
			{
				if(str.length()>0)
				{
					if(this.wordMap.containsKey(str.toString()))
					{
						this.wordMap.put(str.toString(),this.wordMap.get(str.toString())+1);
					}
					else 
					{
						this.wordMap.put(str.toString(),1);
					}
				}
				str.setLength(0);
			}
			else
			{
				if(Character.isLetter(c))
				{
					str.append(c);
				}
			}
			
			
		}
		return wordMap;
		
	}
	
	
	public HashMap<String, Integer> sort(boolean flag)
	{
		
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>();
		
		list.addAll(this.wordMap.entrySet());
		
		if(flag)
		{
			Collections.sort(list, new AsendingMapSort());
		}
			
		else
		{
			Collections.sort(list, new DesendingMapSort());
		}
		
		HashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> e : list)
        {
            result.put( e.getKey(), e.getValue() );
        }
        
//        for(Entry<String, Integer> e : result.entrySet())
//    		{
//    			System.out.println("Key : "+e.getKey()+"; Value : "+e.getValue());
//    		}
		return result ;
		
	}
	

}


