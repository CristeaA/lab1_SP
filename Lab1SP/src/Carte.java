import java.util.ArrayList;

public class Carte {
 private  String titlu;
 private ArrayList<Autor> aTeam;
 private ArrayList<Element> continut= new ArrayList<Element>();
 
 Carte(String titlu ,ArrayList<Autor>autor){
	 
	 this.titlu =titlu ;
	 this.aTeam =autor;
 }
  public void addElement(Element el){
	  
	  
	  this.continut.add(el);
  }
 
 
public void print(){
	for(int i=0;i<continut.size();i++){
		System.out.print(continut.get(i));
	}
	
} 

public  void remove(Element el){
	continut.remove(el);
	
}

public int getChild(){
	
	return 0;
}





}
