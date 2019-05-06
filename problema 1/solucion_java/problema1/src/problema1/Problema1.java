/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author ADMIN-HP
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        String nombrec, nombre, cedula, raza, edad;
        double peso; 
        double tarifa1 = 55; // Perros menos de 5kg
        double tarifa2 = 175; // Perros de 7 a  16 kg
        double tarifa3 = 205; // Perros de 14.1 a 40
        double tarifa4 = 325; // Perros de más de 40
        double costo = 0; 
        
        System.out.println("Ingrese su nombre\n");
        nombre = entrada.nextLine(); 
        System.out.println("Ingrese su N° de cédula\n ");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el nombre del canino\n");
        nombrec = entrada.nextLine();
        System.out.println("Ingrese la edad del canino \n");
        edad = entrada.nextLine();
        System.out.println("Ingrese la raza del canino\n");
        raza = entrada.nextLine();
        System.out.println("Ingrese el peso del canino\n");
        peso = entrada.nextDouble();
     
        if (peso < 5){
        costo = tarifa1;
        }else{
        if (peso == 7 || peso <=16) {
        costo = tarifa2;
        }else{
        if (peso == 14.1 || peso <= 40){
        costo = tarifa3;
        }else{
        if (peso >40){
        
        costo = tarifa3;
                }
        }
        }
        }
       
        // IMPORTACION DE VARIABLES EN INGLES Y ESPAÑOL
        
        
    String pnombre = variables.Variables.nombre;
    String atencion = variables.Variables.atencion;
    String atention = variables.Variables.atention ;
    
    String pdatos = variables.Variables.datos ;
    String pownerI = variables.Variables.ownerI ;
    String pcedula = variables.Variables.cedula ;
    String pid = variables.Variables.id ;
    String pdatosc = variables.Variables.datosc;
    String pcanined = variables.Variables.canined ;
    String pnamec = variables.Variables.namec ;
    String pnombrec = variables.Variables.nombrec ;
    String praza = variables.Variables.raza ;
    String prace = variables.Variables.race ;
    String pedad = variables.Variables.edad ;
    String page = variables.Variables.age ;
    String ppeso = variables.Variables.peso ;
    String pweight = variables.Variables.weight ;
    String ptarifas = variables.Variables.tarifas ;
    String ptarifasi = variables.Variables.tarifasi;
        
System.out.printf("%s\n %s\n\t %s %s\n\t%s %s\n\t%s %s\n\t%s\n%s %s\n\t%s %s\n\t%s %f" ,atencion, pdatos, pcedula, cedula, pdatosc, pnombre, nombrec, praza,raza,pedad,edad, ppeso, peso,ptarifas,costo);
System.out.printf("%s\n %s\n\t %s %s\n\t%s %s\n\t%s %s\n\t%s\n%s %s\n\t%s %s\n\t%s %f" ,atention, pownerI, pid, cedula, pcanined, pnamec, nombrec, prace,raza,page,edad, pweight, peso,ptarifasi,costo);
        
    }
    
}
