import java.util.Scanner;

public class desafioPizza {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		double precoMassa = 0;
		double precoRecheio = 0;
		double precoBorda = 0;
		double precoFPizza = 0;
		int pedido = 1;
		while (pedido == 1) {
			System.out.println("Escolha o tamanho da pizza:");
			System.out.println("1)Pequena ---R$:12,00");
			System.out.println("2)Grande ---R$:16,00");
			System.out.println("3)Cancelar.");
			int massa = sc.nextInt();
			switch (massa) {
				case 1:
					precoMassa += 12.00;
					System.out.println("Beleza! proxima escolha");
					pedido = 2;
					break;
				case 2:
					precoMassa += 16.00;
					System.out.println("Beleza! proxima escolha");
					pedido = 2;
					precoFPizza = 0;
					break;
				case 3:
					System.out.println("Tudo bem, pedido cancelado.");
					pedido = 2;
					return;
				default:
					System.out.println("Peça uma massa.");
					pedido = 1;

			}
		}
		pedido = 1;
		while (pedido == 1) {
			System.out.println("Escolha um sabor da pizza:");
			System.out.println("1)Calabresa ---R$:6,00");
			System.out.println("2)Frango c/ Catupiry ---R$:8,00");
			System.out.println("3)Cancelar.");
			int recheio = sc.nextInt();
			switch (recheio) {
				case 1:
					precoRecheio += 6.00;
					System.out.println("Beleza! proxima escolha");
					pedido = 2;
					break;
				case 2:
					precoRecheio += 8.00;
					System.out.println("Beleza! proxima escolha");
					pedido = 2;
					break;
				case 3:
					System.out.println("Tudo bem, pedido cancelado.");
					pedido = 2;
					precoMassa = 0;
					return;
				default:
					System.out.println("Peça um recheio.");
					pedido = 1;
			}
		}
		pedido = 1;
		while (pedido == 1) {
			System.out.println("Escolha uma borda para a pizza:");
			System.out.println("1)Catupiry ---R$:5,00");
			System.out.println("2)Cheedar ---R$:7,00");
			System.out.println("3)Cancelar.");
			int borda = sc.nextInt();
			switch (borda) {
				case 1:
					precoBorda += 5.00;
					System.out.println("Beleza! proxima escolha");
					pedido = 2;
					break;
				case 2:
					precoBorda += 7.00;
					System.out.println("Pedido finalizado!");
					pedido = 2;
					break;
				case 3:
					System.out.println("Tudo bem, pedido cancelado.");
					pedido = 2;
					precoMassa = 0;
					precoRecheio = 0;
					return;
				default:
					System.out.println("Peça uma borda.");
					pedido = 1;

			}
		}
		precoFPizza = precoMassa + precoRecheio + precoBorda;
		System.out.println("Valor do pedido R$:" + precoFPizza);
		sc.close();
	}
}
