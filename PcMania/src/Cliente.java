public class Cliente {
    String nome;
    long cpf;
    Computador[] computadoresComprados = new Computador[10];
    int contador = 0;

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < contador; i++) {
            total += computadoresComprados[i].preco;
        }
        return total;
    }

    public void mostraCompra() {
        System.out.println("\n--- DADOS DO CLIENTE ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("\n--- COMPUTADORES COMPRADOS ---");

        int[] quantidades = new int[3];
        Computador[] modelos = new Computador[3];

        for (int i = 0; i < contador; i++) {
            if (computadoresComprados[i].marca.equals("Apple")) {
                quantidades[0]++;
                modelos[0] = computadoresComprados[i];
            } else if (computadoresComprados[i].marca.equals("Samsung")) {
                quantidades[1]++;
                modelos[1] = computadoresComprados[i];
            } else if (computadoresComprados[i].marca.equals("Dell")) {
                quantidades[2]++;
                modelos[2] = computadoresComprados[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (quantidades[i] > 0 && modelos[i] != null) {
                System.out.println("Modelo: " + modelos[i].marca);
                System.out.println("Quantidade comprada: " + quantidades[i]);
                modelos[i].mostraPCConfig();
            }
        }

        System.out.println("Total da compra: R$ " + calculaTotalCompra());
    }
}
