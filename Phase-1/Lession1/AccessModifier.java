package practice.project;

class defAccessSpecifier {
	void display() {
		System.out.println("You are using defalut access specifier");
	}
}

public class AccessModifier {
	public static void main(String[] args) {
		// default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();

	}
}

// 2. using private access specifiers
class priaccessspecifier {
	private void display() {
		System.out.println("You are using private access specifier");
	}
}

class AccessModifier2 {
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		priaccessspecifier obj = new priaccessspecifier();
		// trying to access private method of another class
		// obj.display();
	}
}
