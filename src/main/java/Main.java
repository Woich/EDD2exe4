
import utfpr.dainf.ct.ed.exemplo.ArvoreB;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Teste de implementação de árvore B.
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
/*public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.testaArvoreB();
    }
    
    private void testaArvoreB() {
        System.out.println("TESTE DE ARVORE B");
        
        ArvoreB<Integer> a = new ArvoreB<>(3);
        a.insere(30);
        a.insere(70);
        a.insere(50);
        a.insere(10);
        a.insere(90);
        a.insere(40);
        a.insere(95);
        a.insere(20);
        a.insere(60);
        a.insere(45);
        a.insere(80);
        a.insere(25);
        a.insere(75);
        System.out.println("Árvore B: " + a);
    }
}*/
public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.testaArvoreB();
    }
    
    private void testaArvoreB() {
        System.out.println("TESTE DE ARVORE B");
        
        ArvoreB<Integer> a = new ArvoreB<>(5);
        a.insere(30);
        a.insere(70);
        a.insere(50);
        a.insere(10);
        a.insere(90);
        a.insere(40);
        a.insere(95);
        a.insere(100);
        a.insere(110);
        a.insere(120);
        a.insere(130);
        a.insere(140);
        a.insere(150);
        a.insere(160);
        a.insere(170);
        a.insere(180);
        a.insere(190);
        a.insere(200);
        a.insere(210);
        a.insere(220);
        a.insere(230);
        a.insere(240);

        /*
        a.insere(20);
        a.insere(60);
        a.insere(45);
        a.insere(80);
        a.insere(25);
        a.insere(75);
        a.insere(65);
        a.insere(100);
        a.insere(110);
        a.insere(120);
        a.insere(125);
        a.insere(130);
        System.out.println("Árvore B: " + a);
        a.insere(135);
        System.out.println("Árvore B: " + a);
        a.insere(140);
        a.insere(150);
        a.insere(160);*/
        System.out.println("Árvore B: " + a);
        
        int x[] = {30,70,80,95,100};
        for (int i = 0; i < 5; i++){
            System.out.print("Nó que contem " + x[i] + " :");
            System.out.print(a.busca(x[i])+ "\n");
        }
    }
}
