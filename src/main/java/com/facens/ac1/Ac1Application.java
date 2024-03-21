package com.facens.ac1;

import com.facens.ac1.Controller.CategoriaController;
import com.facens.ac1.Controller.ProdutosController;
import com.facens.ac1.Model.Categorias;
import com.facens.ac1.Model.Produtos;
import com.facens.ac1.Repository.CategoriasRepository;
import com.facens.ac1.Repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ac1Application {

	@Bean
	public CommandLineRunner init(@Autowired ProdutosController produtosController, @Autowired CategoriaController categoriaController) {
		return (args) -> {
			Categorias			categoria = new Categorias("Calças", "Calças Jeans");
			Categorias			categoria2 = new Categorias("Camisetas", "Camisetas de manga curta");

			Produtos			produto = new Produtos("Jeans Longo", 3, categoria);
			Produtos			produto2 = new Produtos("Camiseta Polo", 2, categoria2);

			categoriaController.save(categoria);
			categoriaController.save(categoria2);

			produtosController.save(produto);
			produtosController.save(produto2);

			categoriaController.findAll().forEach(x -> System.out.println(x.getId_categorias() + " " + x.getCat_nome() + " " + x.getCat_descricao()));
			produtosController.findAll().forEach(x -> System.out.println(x.getId_produtos() + " " + x.getProd_nome() + " " + x.getProd_qtd() + " " + x.getCategorias().getCat_nome()));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Ac1Application.class, args);
	}
}
