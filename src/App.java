import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner (System.in);

         lista inicio = null;
         lista fim = null;
         lista aux;
           
         System.out.println("Digite 5 números");

           for(int i=0; i<5;i++){
            lista novo = new lista();
            novo.num = input.nextInt();
             if(inicio == null){
                 inicio = novo;
                 fim = novo;
                 novo.prox =null;

             } else{
                 novo.prox = inicio;
                 inicio = novo;
             }
                
            }  
           
                aux = inicio;
                while (aux != null) {
                     System.out.print(aux.num + " ");
                     aux = aux.prox;
                }

     input.close();
    }
}
