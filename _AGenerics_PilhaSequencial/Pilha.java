import java.util.Scanner;
public class ExercicioGenerics {
private static final int TAM_PILHA = 200;
    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<Integer>(TAM_PILHA);
        Pilha<Integer> p2 = new Pilha<Integer>(TAM_PILHA);
        
        int n, cont = 0;
        char resp;
        Scanner s = new Scanner(System.in);
        do {// leitura dos números
            System.out.print("Deseja fornecer um nro (S/N): ");
            resp = s.next().toUpperCase().charAt(0);
            if (resp == 'S') {
                System.out.print("Forneça o "+ ++cont + "o nro: ");
                n = s.nextInt();
                p.push(n);
            }
        } while( resp == 'S') && (cont < TAM_PILHA);{
            if((p.topo() % 5 == 0) && (p.topo() % 3 == 0)){
                p.pop();
            }
            else{
                p2.push(n)
            }
            
        }

        System.out.println(p3);
} 
}
