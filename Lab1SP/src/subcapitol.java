import java.util.ArrayList;

public class Subcapitol 
{
	ArrayList<Element> elemente = new ArrayList<Element>();

	
	public Subcapitol() 
	{
		
		
	}
	
	public void addElement(Element elem)
	{
		elemente.add(elem);
	}
	
	public void print()
	{
		for(int i=0;i<elemente.size();i++)
		{
			System.out.println(elemente.get(i));
		}
		
	}
	
}
