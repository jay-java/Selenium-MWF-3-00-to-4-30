//String -> String is sequence of characters
//		->array format
public class StringDemo {
	public static void main(String[] args) {
		char[] name = { 'D', 'E', 'V', 'A', 'R', 'S', 'H' };
		System.out.println(name);
		String name1 = "hello devarsh how are you ?";
		System.out.println(name1);
		System.out.println(name1.length());
		System.out.println(name1.charAt(26));
		String name2 = "do you want learn java ?";
		System.out.println(name1.concat(name2));
		String s1 = "TOPS";
		String s2 = "tops";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3="     ";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		String s4 = "    	java				";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.toUpperCase());
	}
}
