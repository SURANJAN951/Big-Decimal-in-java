import java.math.BigDecimal;
public class BigDec {
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("0.06");
		BigDecimal b = new BigDecimal("0.04");
		
		BigDecimal c = a.add(b);
		BigDecimal d = a.subtract(b);
		BigDecimal e = a.multiply(b);
		BigDecimal f = a.divide(b);
		
		System.out.println(c);
		System.out.println(d);
	}

}
