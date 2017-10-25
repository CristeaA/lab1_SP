
public class Paragraf implements Element {
	
//private static String nume;
String text;

	public Paragraf(String text) {
	
		this.text=text;// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println(text);
	}
	
	public void addEleent(Element el) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("No suported element");
	}

	
	public void removeElement(Element el) throws Exception {
		throw new Exception("Cand add element here!");
		// TODO Auto-generated method stub
		
	}

	
	public int getChild(int poz) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void addElement(Element el) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element el) {
		// TODO Auto-generated method stub
		
	}
}