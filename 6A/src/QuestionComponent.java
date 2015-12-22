import java.util.ArrayList;
import java.util.ListIterator;

//Component
public abstract class QuestionComponent {

	public abstract void print();

}

//leaf
class Question extends QuestionComponent {


	String description;

	public Question(String desc) {

		this.description = desc;

	}

	public void print() {

		System.out.println(description);

	}

}

//Composite
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
		
		ListIterator<QuestionComponent> iterator = (ListIterator<QuestionComponent>) list.iterator();
		
		while (iterator.hasNext()) {
			
			QuestionComponent c = iterator.next();
			c.print();
			
		}
		
	}
	
}