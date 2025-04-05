import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.print("Digite seu nome: ");
        cliente.nome = input.nextLine();
        System.out.print("Digite seu CPF: ");
        cliente.cpf = input.nextLong();

        Computador pc1 = new Computador();
        pc1.marca = "Apple";
        pc1.preco = 775;
        pc1.hardwareBasico[0] = new HardwareBasico("Pentium Core i3", 2200);
        pc1.hardwareBasico[1] = new HardwareBasico("Memória RAM", 8);
        pc1.hardwareBasico[2] = new HardwareBasico("HD", 500);
        pc1.sistemaOperacional = new SistemaOperacional("Linux Ubuntu", 32);
        pc1.memoriaUSB = new MemoriaUSB("Pen-drive", 16);

        Computador pc2 = new Computador();
        pc2.marca = "Samsung";
        pc2.preco = 2009;
        pc2.hardwareBasico[0] = new HardwareBasico("Pentium Core i5", 3370);
        pc2.hardwareBasico[1] = new HardwareBasico("Memória RAM", 16);
        pc2.hardwareBasico[2] = new HardwareBasico("HD", 1000);
        pc2.sistemaOperacional = new SistemaOperacional("Windows 8", 64);
        pc2.memoriaUSB = new MemoriaUSB("Pen-drive", 32);

        Computador pc3 = new Computador();
        pc3.marca = "Dell";
        pc3.preco = 6453;
        pc3.hardwareBasico[0] = new HardwareBasico("Pentium Core i7", 4500);
        pc3.hardwareBasico[1] = new HardwareBasico("Memória RAM", 32);
        pc3.hardwareBasico[2] = new HardwareBasico("HD", 2000);
        pc3.sistemaOperacional = new SistemaOperacional("Windows 10", 64);
        pc3.memoriaUSB = new MemoriaUSB("HD Externo", 1000);

        System.out.println("\n--- PROMOÇÕES DISPONÍVEIS ---");
        System.out.println("PROMOÇÃO 1:");
        pc1.mostraPCConfig();
        System.out.println("PROMOÇÃO 2:");
        pc2.mostraPCConfig();
        System.out.println("PROMOÇÃO 3:");
        pc3.mostraPCConfig();

        int opcao;
        do {
            System.out.println("Digite o código da promoção que deseja comprar:");
            System.out.println("1 - Promoção Apple");
            System.out.println("2 - Promoção Samsung");
            System.out.println("3 - Promoção Dell");
            System.out.println("0 - Finalizar compra");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                cliente.computadoresComprados[cliente.contador++] = pc1;
            } else if (opcao == 2) {
                cliente.computadoresComprados[cliente.contador++] = pc2;
            } else if (opcao == 3) {
                cliente.computadoresComprados[cliente.contador++] = pc3;
            } else if (opcao != 0) {
                System.out.println("Código inválido.");
            }
        } while (opcao != 0);

        cliente.mostraCompra();

        input.close();
    }
}
