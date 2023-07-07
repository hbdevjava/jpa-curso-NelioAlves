package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa(null, "Hebert Brito", "hb@outlook.com");
		Pessoa pessoa2 = new Pessoa(null, "Vikas Brito", "vk@outlook.com");
		Pessoa pessoa3 = new Pessoa(null, "Alisson Rodrigues", "son@outlook.com");
		Pessoa pessoa4 = new Pessoa(null, "Dorinha", "dora@outlook.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		System.out.println("PERSISTIR DADOS NO BANCO ");
//		em.getTransaction().begin();
//		em.persist(pessoa1);
//		em.persist(pessoa2);
//		em.persist(pessoa3);
//		em.persist(pessoa4);
//		em.getTransaction().commit();
		System.out.println();

		System.out.println("RECUPERAR DADOS NO BANCO PELO ID");
		// -> NAO PRECISSA em.getTransaction().begin(); E em.getTransaction().commit();
		Pessoa encontar = em.find(Pessoa.class, 1);
		System.out.println("Id: " + encontar.getId());
		System.out.println("Name: " + encontar.getNome());
		System.out.println("E-mail: " + encontar.getEmail());
		System.out.println();

		System.out.println("DELETAR DADOS NO BANCO PELO ID");
//		em.getTransaction().begin();
//
//		Pessoa pessoa = em.find(Pessoa.class, 4);
//
//		if (pessoa != null) {
//			em.remove(pessoa);
//		}
//		em.getTransaction().commit();
		System.out.println();
		
		System.out.println("ALTERAR DADOS NO BANCO PELO ID");
//		em.getTransaction().begin();
//		Pessoa pessoaNova = em.find(Pessoa.class, 1);
//		//System.out.println("E-mail: " + user.getEmail());
//		pessoaNova.setEmail("hbdev@outlook.com");
//		em.merge(pessoaNova); //-> Merge() é o metodo responsavel pela alteração;
//		System.out.println("E-mail: " + pessoaNova.getEmail());
//		em.getTransaction().commit();
		

		em.close();
		emf.close();
		System.out.println("Pronto...");

	}

}
