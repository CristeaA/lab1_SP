import java.util.ArrayList;

public class Sectiune implements Element {
	private String titlu;
	private ArrayList<Element> secContinut = new ArrayList<Element>();
	public Sectiune(String titlu) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addElement(Element el) throws Exception {
		// TODO Auto-generated method stub
		this.secContinut.add(el);
	}
	public ArrayList<Element> getChilds (){
		return secContinut;
		
	}
	public void removeElement(Element el) throws Exception{
		this.secContinut.remove(el);
	}
	public Element getChild(int poz) {
		return  secContinut.get(poz);
	}
	public void print() {}

	@Override
	public void accept(Visitor v) {
		v.visitSectiune(this);
		
	}

	
}
