
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) throws Exception
	{
		Carte ca = new Carte(null, null);
		Paragraf p = new Paragraf("Paragraf 1 ");
		p.setAlign(new LeftAlign());
		Tabel t = new Tabel("Tabelul");
		//t.addEleent(null);
		Paragraf p2 = new Paragraf("Paragraf 2");
		p2.setAlign(new CenterAlign());
		Sectiune se = new Sectiune("Sectiunea");
		se.addElement(p);
		se.addElement(t);
		se.addElement(p2);
		ca.addElement(se);
		//se.addElement(p);
		//ca.addElement(p2);
		//System.out.println(p.text + t.titluTabel );
		se.print();
		DocumentStatisticVisitor doc = new DocumentStatisticVisitor();
		ca.accept(doc);
		doc.printStatistics();
				
	}
}
