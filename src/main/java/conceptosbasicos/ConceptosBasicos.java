/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author LUEN
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
         
        //Tarea: Programar los objetos miAcura y miMustang
        //Acura NSX
        
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Acura (Honda)");
        miAcura.setSubMarca("Supercarro (NSX)");
        miAcura.setModelo(2020);
        miAcura.setColor(Color.white);
        System.out.println(miAcura);
        
        //Mustang Shelby
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford Motor Company");
        miMustang.setSubMarca("Carro deportivo (Mustang Shelby)");
        miMustang.setModelo(1980);
        miMustang.setColor(Color.red);
        System.out.println(miMustang);
        
        // Nissan GTR
        
        Automovil miGTR = new Automovil();
        miMustang.setMarca("Nissan");
        miMustang.setSubMarca("Carro deportivo (GT-R)");
        miMustang.setModelo(2022);
        miMustang.setColor(Color.green);
        System.out.println(miMustang);
    }
    
}