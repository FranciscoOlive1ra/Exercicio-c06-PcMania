public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardwareBasico = new HardwareBasico[3];
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriaUSB;

    public void mostraPCConfig() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Hardware:");
        for (int i = 0; i < hardwareBasico.length; i++) {
            System.out.println("- " + hardwareBasico[i].nome + " - " + hardwareBasico[i].capacidade);
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " - " + sistemaOperacional.tipo + " bits");
        if (memoriaUSB != null) {
            System.out.println("Brinde: " + memoriaUSB.nome + " - " + memoriaUSB.capacidade + "Gb");
        }
        System.out.println();
    }
}