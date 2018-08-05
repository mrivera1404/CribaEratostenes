package com.cenfotec.patrones.examen2;

public class CribaEratostenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = generaCriba(20);
		for (int i = 0; i < n.length; i++){
			System.out.println("Numero primo: " + n[i]);
		}
		//System.out.println("Hello Word!");
	}
	
	public static int[] generaCriba(int tope){

		if (tope >= 2){
			boolean[] primo = new boolean[tope + 1];
			
			for (int i = 0; i < primo.length; i++){
				primo[i] = true;
			}
			
			primo[0] = primo[1] = false;
			
			for (int i = 2; i< Math.sqrt(primo.length) + 1; i++){
				if (primo[i]){
					for (int j = 2*i; j < primo.length; j+=i){
						primo[j] = false;
					}
				}
			}
			
			int cuenta = 0;
			
			for (int i = 0; i < primo.length; i++){
				if (primo[i])
					cuenta++;
			}
			
			int[] primos = new int[cuenta];
			for (int i = 0,j=0; i < primo.length; i++){
				if (primo[i])
					primos[j++] = 1;
			}
			
			return primos;
		} else {
			return null;
		}
	}

}
