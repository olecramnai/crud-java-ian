import classes.Categoria;
import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        // CADASTRAR CATEGORIA
        // Categoria categoria = new Categoria(0);
        // categoria.setNome("Categoria Batata");
        // categoria.adicionar();

        // BUSCAR CATEGORIA
        // Categoria categoria = new Categoria(2);
        // System.out.println(categoria.getNome());


        // Produto p = new Produto();
        // p.setCategoriaId(1);
        // p.setNome("Produto 01");
        // p.setPreco(9.99);    	
        // p.setQuantidade(12); 
        // p.adicionar();   

        // BUSCAR PRODUTO
        Produto produto = new Produto(1); 
                produto.setPreco(99.99);    	
                produto.atualizar();



        System.out.println(produto.getNome());
    }
}
