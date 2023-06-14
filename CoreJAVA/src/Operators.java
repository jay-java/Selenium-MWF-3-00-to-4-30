
public class Operators {
	public static void main(String[] args) {
//		conditional->&& and || and !
//		arithemtic->+,-,*,/,%
//		shorthand->+=,-=,/=,*=
//		logical ==,<,>,>=,<=
//		assignment = 
//		i++,++i,i--,--i
		int i = 9;
		int j = ++i;// i=i+1
		System.out.println(j);
		System.out.println(i);
		int k = j++;
		System.out.println(k);
		int l = k++;
		System.out.println(l);
		System.out.println(k);

		int a = 90;
		int b = 40;
		a /= 2;// a = a*2

		System.out.println(a);
		// b += a;//b = b+a
		b -= a;// b =b-a
		System.out.println(b);
		int c = 20;
		int d = 100;
		d =- c;
		System.out.println(d);
	}

}
