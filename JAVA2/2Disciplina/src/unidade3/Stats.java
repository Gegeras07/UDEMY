package unidade3;

public class Stats<T extends Number> {
	
	T[] num;

	public Stats(T[] num) {
		super();
		this.num = num;
	}
	
	public double media() {	
		
		double soma = 0;
		
		for(int i = 0; i < num.length; i++)
			soma = soma + num[i].doubleValue();
		
		return(soma / num.length);
	}

}
