package questao_3;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class questao_3 {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);
		
		Deque<post_rs> deque = new LinkedList<post_rs>();
		
		int opcao=0;
		byte relev;
		String mensagem;
		
		do {
			System.out.println("----------MENU----------");
			System.out.println("[1]Cadastrar post");
			System.out.println("[2]Ver posts relevantes");
			System.out.println("[3]Sair");
			System.out.println("------------------------");
            opcao = ler.nextInt();
            ler = new Scanner(System.in);
            switch (opcao){
                case 1:
                    System.out.println("Insira o post: ");
                    mensagem = ler.nextLine();
                    System.out.println("É considerado um post relevante? (1: Relevante / 2: Normal)");
                    relev = ler.nextByte();
                    	if (relev==1){
                        post_rs post = new post_rs(mensagem, relev);
                        deque.addFirst(post);
                        System.out.println("Post adicionado com sucesso!");
                    	}
                    	else if (relev==2) {
                    		post_rs post = new post_rs(mensagem, relev);
                    		deque.addLast(post);
                    	}
                    	else{
                    		System.out.println("Defina de maneira correta a relevância do seu post.");
                    	}
                    	break;
                case 2:
                    for (post_rs post: deque){
                        if (post.getRelev()==1){
                            System.out.println(post.getMensagem() +"\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Inválido!");
            		}
			}
		
		while(opcao!=3);
	}

}
