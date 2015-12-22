
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab lab = new Lab();
		QuestionComposite qc = new QuestionComposite();
		qc.addCompoment(new Question("1.What is your name?"));
		qc.addCompoment(new Question("2.How old are you?"));
		qc.addCompoment(new Question("3.How much it is?"));
		
		lab.m1(qc);

	}
	
	void m1 (QuestionComposite cc) {
		
		for (QuestionComponent c: cc.list) {
			
			c.print();
			
		}
		
	}

}
