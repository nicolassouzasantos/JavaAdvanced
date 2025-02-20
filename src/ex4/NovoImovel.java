package ex4;

public class NovoImovel extends Imovel {
    private double precoAdicional;

    public NovoImovel(String endereco, double preco, double precoAdicional) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public double getPrecoTotal() {
        return getPreco() + precoAdicional;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Preço Adicional: R$ " + precoAdicional);
        System.out.println("Preço Total: R$ " + getPrecoTotal());
    }
}
