/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubogeometry;

import java.util.Scanner;

public class CuboGeometry {
    /**
     * @param args the command line arguments
     */
        private Scanner reader ;
        private double arista;
        private double volumen;
        private double  area;
        
        public void inicializar(){
            reader = new Scanner(System.in);
            System.out.print("Ingrese arista del cubo \n");
            arista = reader.nextDouble();
            
        }
        public void Volumen(){
            volumen = Math.pow(arista,3);
            System.out.print("El volumen del cubo es: "+volumen +"\n");
        }
        public void Area(){
            area = 6*(Math.pow(arista,2));
            System.out.print("El area del cubo es: "+area+"\n");
        }

    
}
