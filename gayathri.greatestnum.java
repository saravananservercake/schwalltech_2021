package findgreaternumber;

public class Findgreaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=40,c=80,d=100,e=700,f=500;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e) {
						if(a>f) {
							System.out.println(a+"will greatest");
						}
						else {
							System.out.println(f+"will greatest");
						
							
						}
					}
				}
			}
		}
		else 
			if(b>c) {
				if(b>d) {
					if(b<e) {
						if(b<f) {
							System.out.println(b+"will greatest");
						}
						else {
							System.out.println(f+"will greatest");
						}
					}
				}
			}
		
		else
			if(c>d) {
				if(c>e) {
					if(c>f) {
						System.out.println(c+"will greatest");
					}
					else {
						System.out.println(f+"will greatest");
					}
				}
				
			}
			else
				if(d>e) {
					if(d>f) {
						System.out.println(d+"will greatest");
					}
					else {
						System.out.println(f+"will greatest");
					}
					}
					
				
			else
				if(e>f) {
					System.out.println(e+"will greatest");
				}
				else {
					System.out.println(f+"will greatest");
				}
			}
		}
