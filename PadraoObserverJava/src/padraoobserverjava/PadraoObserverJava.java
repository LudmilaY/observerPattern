/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoobserverjava;

/**
 *
 * @author user
 */
public class PadraoObserverJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int novaEdicao = 3;
        Revista revista = new Revista();
        Assinante assinante1 = new Assinante(revista);
        assinante1.setNome("Grupinho");
        Assinante assinante2 = new Assinante(revista);
        assinante2.setNome("Bolado");
        revista.setEdicao(novaEdicao);
        
        //Fazer lista de edições para que usuários tenham um ou mais revistas as quais se interessam
        //Criar Banco de Dados.......................................
    }
    
}
