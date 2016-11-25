package zwei;


import data.*;
import stack.*;
public class main {

	public static void main(String[] args) {
		Student s1 = new Student("micky", "mouse", 2, 2563, 1);
		Student s2 = new Student("yoo", "hoo", 2, 2586, 1);
		Student s3 = new Student("lern", "java", 2, 2514, 0);
		
		stackable<Student> stack = new Stack<Student>();
		
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		
		System.out.println("size: "+ stack.getSize());
		System.out.println("pop: "+ stack.pop());
		System.out.println("size: "+ stack.getSize());
		System.out.println("pop: "+ stack.pop());
		System.out.println("isempty: "+ stack.isEmpty());

		
		stack.prinAll();
	}

}
