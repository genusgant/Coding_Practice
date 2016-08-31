package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Set;

class FileCompressor
{
	private String filename;
	private File file;
	private String path;
	private String parent; 
	private HashMap<Character,Integer> freqMap;
	private HashMap<Character,String> codeMap;
	
	
	public FileCompressor(String string) {
		// TODO Auto-generated constructor stub
		file = new File(string);
		filename = file.getName();
		path = file.getAbsolutePath();
		parent = file.getParent();
		freqMap = new HashMap<Character,Integer>(); 
	}

	

	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}



	public File getFile() {
		return file;
	}



	public void setFile(File file) {
		this.file = file;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}
	
	



	public String getParent() {
		return parent;
	}



	public void setParent(String parent) {
		this.parent = parent;
	}
	
	



	public HashMap<Character, Integer> getFreqMap() {
		return freqMap;
	}



	public void setFreqMap(HashMap<Character, Integer> freqMap) {
		this.freqMap = freqMap;
	}



	public HashMap<Character, String> getCodeMap() {
		return codeMap;
	}



	public void setCodeMap(HashMap<Character, String> codeMap) {
		this.codeMap = codeMap;
	}



	public void fileRead()
	{
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line ="";
			
			while((line = br.readLine())!= null)
			{
				getFreq(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public void getFreq(String s)
	{
		
		for(Character c: s.toCharArray())
		{
			if (freqMap.containsKey(c))
			{
				freqMap.put(c, (freqMap.get(c)+1));
			}
			else 
			{
				freqMap.put(c, 1);
			}
		}
	}
	
	public void getHufmanCode()
	{
		
	}
	
}


class Huffman
{
	
	private Hnode root;
	private Set<Hnode> list;
	
	public Huffman(HashMap<Character, Integer> freqMap) {
		// TODO Auto-generated constructor stub
		 
	}
	
	

	
}


class Hnode
{
	private Character c;
	private int freq;
	private Hnode left;
	private Hnode right;
	
	
	
	public Hnode(Character c, int freq, Hnode left, Hnode right) {
		super();
		this.c = c;
		this.freq = freq;
		this.left = left;
		this.right = right;
	}
	
	public Character getC() {
		return c;
	}
	public void setC(Character c) {
		this.c = c;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	public Hnode getLeft() {
		return left;
	}
	public void setLeft(Hnode left) {
		this.left = left;
	}
	public Hnode getRight() {
		return right;
	}
	public void setRight(Hnode right) {
		this.right = right;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileCompressor c = new FileCompressor("C:/Users/genus/OneDrive/Resume/Cover letter all.txt");
		
		
		System.out.println(c.getPath());
		System.out.println(c.getFilename());
		//System.out.println(c.getParent());
		c.fileRead();
		System.out.println("count done");
		Huffman h = new Huffman(c.getFreqMap());
	}

}
