package treinamentosenai;
import java.util.Scanner;
import java.util.ArrayList;

public class imobiliaria {
		private String nomedoimovel;
		private int precoimovel;
		private int quartos;
		
		imobiliaria (String nomedoimovel, int precoimovel, int quartos){
			this.nomedoimovel = nomedoimovel;
			this.precoimovel = precoimovel;
			this.quartos = quartos;
		}
		
	public String getNomedoimovel() {
		return nomedoimovel;
	}
	
	public int getPrecoimovel() {
		return precoimovel;
	}
	
	public int getQuartos() {
		return quartos;
	}
	
	
	@Override
	public String toString() {
		return "\nTIPO DO IMOVEL: " + nomedoimovel + " - PREÇO DO IMOVEL: " + precoimovel + " - QUANTIDADE DE QUARTOS: " + quartos + "\n";
	}
		
	public static void limparConsole() {
	        for (int i = 0; i < 20; ++i) System.out.println();
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<imobiliaria> lista = new ArrayList<>();
		boolean sair = false;
		 
		System.out.println("---------------------------------------------------");
		System.out.println("================= Prime Imóveis ===================");
		System.out.println("---------------------------------------------------");
				
		while (!sair) {
			System.out.println("\n\nQUAL CIDADE VOCÊ DESEJA FAZER UMA BUSCA? \n1- LOS ANGELES\n2- WASHINGTON\n3-FLORIDA\n4- CHICAGO\n5- SAIR");
			int numescolha = scanner.nextInt();
			
			limparConsole();
			
			lista.clear();
			
			switch(numescolha){
			case 1:
				boolean voltar = false;
				while (!voltar) {
					
					System.out.println("SEJA BEM VINDO AOS IMÓVEIS DE LOS ANGELES \nDESEJA PROCURAR CASAS A VENDAS OU CASAS PARA ALUGAR? \n1- CASAS A VENDA \n2- CASAS PARA ALUGAR \n3- VOLTAR");
					int losangeles = scanner.nextInt();
					switch(losangeles) {
					case 1:
						limparConsole();
						lista.add(new imobiliaria("MANSÃO", 900000, 6));
						lista.add(new imobiliaria("CASA COMUM", 370000,3));
						lista.add(new imobiliaria("CASA FAMILIAR", 122000,2));
						System.out.println(lista.toString());
						voltar = true;
						break;
					case 2:
						limparConsole();
						lista.add(new imobiliaria("STUDIO", 3095, 2));
						lista.add(new imobiliaria("APARTAMENTO", 14995, 3));
						lista.add(new imobiliaria("CASA COMUM", 3595, 2));
						System.out.println(lista.toString());
						voltar = true;
						break;
					case 3:
						voltar = true;
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
						limparConsole();
						voltar = true;
						break;
					}
				}
				break;
			case 2:
				boolean voltar2 = false;
				while (!voltar2) {
					
						System.out.println("SEJA BEM VINDO AOS IMÓVEIS DE WASHINGTON \nDESEJA PROCURAR CASAS A VENDAS OU CASAS PARA ALUGAR? \n1- CASAS A VENDA \n2- CASAS PARA ALUGAR \n3- VOLTAR");
						int washington = scanner.nextInt();
						switch(washington) {
						case 1:
							limparConsole();
							lista.add(new imobiliaria("CASA COMUM", 90000, 1));
							lista.add(new imobiliaria("MANSÃO", 31900000,5));
							lista.add(new imobiliaria("APARTAMENTO", 320100,3));
							System.out.println(lista.toString());
							voltar2 = true;
							break;
						case 2:
							limparConsole();
							lista.add(new imobiliaria("STUDIO", 1586, 1));
							lista.add(new imobiliaria("CASA COMUM", 2135, 1));
							lista.add(new imobiliaria("STUDIO", 2365, 1));
							System.out.println(lista.toString());
							voltar2 = true;
							break;
						case 3:
							voltar2 = true;
							break;
						default:
							System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
							limparConsole();
							voltar2 = true;
							break;
					}
				}
				break;
			case 3:
				boolean voltar3 = false;
				while (!voltar3) {
					
						System.out.println("SEJA BEM VINDO AOS IMÓVEIS DE FLORIDA \nDESEJA PROCURAR CASAS A VENDAS OU CASAS PARA ALUGAR? \n1- CASAS A VENDA \n2- CASAS PARA ALUGAR \n3- VOLTAR");
						int florida = scanner.nextInt();
						switch(florida) {
						case 1:
							limparConsole();
							lista.add(new imobiliaria("MANSÃO", 715000, 4));
							lista.add(new imobiliaria("CASA COMUM", 260000,3));
							lista.add(new imobiliaria("CASA 2 ANDARES", 359000,3));
							System.out.println(lista.toString());
							voltar3 = true;
							break;
						case 2:
							limparConsole();
							lista.add(new imobiliaria("CASA COMUM", 2750, 3));
							lista.add(new imobiliaria("STUDIO", 1500, 2));
							lista.add(new imobiliaria("CASA COMUM", 3000, 3));
							System.out.println(lista.toString());
							voltar3 = true;
							break;
						case 3:
							voltar3 = true;
						break;
						default:
							System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
							limparConsole();
							voltar3 = true;
							break;
					}
				}
				break;
			case 4:
				boolean voltar4 = false;
				while (!voltar4) {
					
						System.out.println("SEJA BEM VINDO AOS IMÓVEIS DE CHICAGO \nDESEJA PROCURAR CASAS A VENDAS OU CASAS PARA ALUGAR? \n1- CASAS A VENDA \n2- CASAS PARA ALUGAR \n3- VOLTAR");
						int chicago = scanner.nextInt();
						switch(chicago) {
						case 1:
							limparConsole();
							lista.add(new imobiliaria("CASA 2 ANDARES", 245000, 3));
							lista.add(new imobiliaria("APARTAMENTO 2 ANDARES", 1175000,3));
							lista.add(new imobiliaria("CASA 2 ANDARES", 379000,4));
							System.out.println(lista.toString());
							voltar4 = true;
							break;
						case 2:
							limparConsole();
							lista.add(new imobiliaria("APARTAMENTO", 1650, 1));
							lista.add(new imobiliaria("STUDIO", 2265, 1));
							lista.add(new imobiliaria("CASA COMUM", 3600, 3));
							System.out.println(lista.toString());
							voltar4 = true;
							break;
						case 3:
							voltar4 = true;
							break;
						default:
							System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
							limparConsole();
							voltar4 = true;
							break;
					}
				}
				break;
			case 5:
					sair = true;
				break;
			default:
					System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
					limparConsole();
					sair = true;
				break;
			}
		}
		
		limparConsole();
		System.out.println("SISTEMA DA IMOBILIARIA ESTÁ SENDO ENCERRADO, ATÉ A PROXIMA!");
        scanner.close();
	}
}
