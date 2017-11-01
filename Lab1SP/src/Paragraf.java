import java.util.ArrayList;

public class Paragraf extends AbstractElement1 {

private String text;
private ArrayList<Element> paragraf = new ArrayList<Element>();
	public Paragraf(String text) {
	
		this.text=text;// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println(text);
	}
	/*
	public void addEleent(Element el) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("No suported element");
	}

	
	public void removeElement(Element el) throws Exception {
		throw new Exception("Cand add element here!");
		// TODO Auto-generated method stub
		
	}

	
	public Element getChild(int poz) throws Exception {
		// TODO Auto-generated method stub
		//return paragraf.get(poz);
		throw new Exception ("Cant get child here!");
	}
*/
}
