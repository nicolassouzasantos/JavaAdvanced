package ex4;

public class Main {
    public static void main(String[] args) {
        Imovel novaPropriedade = new NovoImovel("Rua Nova 123", 200000, 10000);

        Imovel propriedadeAntiga = new VelhoImovel("Rua Velha 456", 150000, 20000);

        System.out.println("Detalhes da Nova Propriedade:");
        novaPropriedade.imprimirDetalhes();

        System.out.println("\nDetalhes da Propriedade Antiga:");
        propriedadeAntiga.imprimirDetalhes();
    }
}