package Aula;


import java.util.Stack;



/**
 *
 * @author Aderito
 */
public class Pilha {


    
    public static void pilha(){
        
        Stack<String> hierarquia = new Stack<>();
        hierarquia.push("Estudante");
        hierarquia.push("Docente");
        hierarquia.push("Diretor do curso");
        hierarquia.push("Reitor");
        //Primeiro a entrar e ultimo a sair
        for (String c : hierarquia) {
            System.out.println(c);
        }
        System.out.println("");
         System.out.println("");
        System.out.println("Usando o peek: PEGAR O TOPO DA Pilha");
        System.out.println(hierarquia.peek());
        
         System.out.println("")
                 ;System.out.println("");
        System.out.println("Usando o pop: PEGAR O TOPO DA Pilha e retirar");
        System.out.println(hierarquia.pop());
         System.out.println("");
         System.out.println("Pilha com elemento retirado:");
           for (String c : hierarquia) {
            System.out.println(c);
        }
        
          System.out.println("");
         System.out.println("Limpando a pilha");
         hierarquia.clear();
         //limpa a pilha
         
        System.out.println( hierarquia.empty()?"Pilha vazia":"Pilha com elementos");

    }
    
        }
    
    
    
    

