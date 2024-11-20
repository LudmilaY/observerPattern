/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoobserverjava;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author user
 */
class Assinante implements Observer{
    
    private Observable revista;
    private int edicaoNovaRevista;
    private String nome;
    
    public Observable geRevista(){
        return revista;
    }
    
    public void setRevista (Observable revista){
        this.revista = revista;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
       this.nome = nome;
    }
    
    public Assinante (Observable revista){
        this.revista = revista;
        revista.addObserver(this);
    }
    
    @Override
    public void update (Observable revistaSubject, Object arg){
        if (revistaSubject instanceof Revista){
            Revista revista = (Revista) revistaSubject;
            edicaoNovaRevista = revista.getEdicao();
            System.out.println("Atenção " + getNome() + ", já chegou mais uma edição da Revista. " + "Esta é sua edição número:" + edicaoNovaRevista);
        }
    }
    
}
