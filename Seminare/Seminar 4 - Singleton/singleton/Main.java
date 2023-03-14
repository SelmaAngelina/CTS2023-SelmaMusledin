package singleton;

public class Main {
	public static void main(String[] args) {
		Papa papa1 = Papa.getInstance();
		System.out.println(papa1);
		
		Papa papa2 = Papa.getInstance();
		System.out.println(papa2);
		
		DirectorGeneral dir1 = DirectorGeneral.getInstance("Andrei");
		
		DirectorGeneral dir2 = DirectorGeneral.getInstance("Alex");
		
		System.out.println(dir1.toString());
		System.out.println(dir2.toString());
	}
}
