package ex4;

public class VelhoImovel extends Imovel {
    private double desconto;

    public VelhoImovel(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getPrecoComDesconto() {
        return getPreco() - desconto;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço com Desconto: R$ " + getPrecoComDesconto());
    }
}
