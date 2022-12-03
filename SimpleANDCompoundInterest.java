package Simple;

public class SimpleANDCompoundInterest {

	public static void main(String[] args) {

double p = 1000.0;
double n = 2.0; 
double r = 7.0;
double si = (p*n*r)/100.0;
double ci = p*(Math.pow((1+r/100.0),n))-p;
System.out.println(si);
System.out.println(ci);

	}

}
