import java.util.ArrayList;

public class Carte {
private String titlu;
private ArrayList<Autor> aTeam;
private ArrayList<Element> continut = new ArrayList<Element>();

	public Carte(String titlu,ArrayList<Autor> aTeam) {
		// TODO Auto-generated constructor stub
		this.titlu=titlu;
		this.aTeam=aTeam;
	}
	public void addCapitol(Element el) {
		this.continut.add(el);
	}
	
	public void print() {
		for(int i=0;i<continut.size();i++) {
			System.out.println(continut.get(i));
		}
	}
	
	public void remove(Element el) {
		continut.remove(el);
	}
	
}
