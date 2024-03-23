public class Produtos {
    private String nomeProduto;
    private String descricaoProduto;
    private double valorProduto;
    private boolean disponivelVenda;
    public String getNome() {
        return nomeProduto;
    }

    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public boolean isDisponivelVenda() {
        return disponivelVenda;
    }

    public void setDisponivelVenda(boolean disponivelVenda) {
        this.disponivelVenda = disponivelVenda;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    //Crie o metodo CadastrarProduto
    public void CadastrarProduto(String nomeProduto, String descricaoProduto, double valorProduto, boolean disponivelVenda) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
        this.disponivelVenda = disponivelVenda;
    }

    //Crie o metodo ListarProdutos
    public void ListarProdutos() {
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Descrição do produto: " + descricaoProduto);
        System.out.println("Valor do produto: " + valorProduto);
        System.out.println("Disponível para venda: " + disponivelVenda);
    }

}
