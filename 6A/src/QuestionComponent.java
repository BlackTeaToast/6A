import java.util.ArrayList;

public abstract class QuestionComponent {

	public abstract void print();

}

class Question extends QuestionComponent {


	String description;

	public Question(String desc) {

		this.description = desc;

	}

	public void print() {

		System.out.println(description);

	}

}

class QuestionComposite extends QuestionComponent {

	ArrayList<QuestionComponent> list;
	
	public QuestionComposite() {
		
		list = new ArrayList<QuestionComponent>();
		
	}
	
	void addCompoment(QuestionComponent c) {
		
		list.add(c);
		
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}