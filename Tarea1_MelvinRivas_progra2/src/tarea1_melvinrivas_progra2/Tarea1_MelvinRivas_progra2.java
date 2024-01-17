/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_melvinrivas_progra2;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author l3306
 */
public class Tarea1_MelvinRivas_progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        //arreglo clae animal para guardar el registro de todos los animales 
        ArrayList<animales> ani2 = new ArrayList<>();
        int op = 0;
        do{
        // ventana que nos mostrar el menu principal
        String [] opciones = {"Agregar","Listar","Modificar","Eliminar","Mascota mas antigua","Mascota negra","Diferencia de edad","Salir"};
        op = JOptionPane.showOptionDialog(null, "Administracion de mascotas", "bienvenido", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, input);
        
        switch (op) {
            case 0: {
                
                if (ani2.size()<= 100) {
                    
                    //venatana para poder agregar el nombre del animal
                    String nom = JOptionPane.showInputDialog(null, "Agregue Nombre", "Agregando mascota", JOptionPane.PLAIN_MESSAGE);
                    //ventana para poder agregar el tipo de animal a registrar
                    String tipo = JOptionPane.showInputDialog(null, "Agregue Tipo", "Agregando mascota", JOptionPane.PLAIN_MESSAGE);
                    //ventana que habre la tabla de colores dando a elejir el color de preferencia
                    Color color ;
                        JColorChooser colorcito = new JColorChooser();
                        color = colorcito.showDialog(null,"Selecciona un color",Color.GRAY);
                    
                    //ventana para poder agregar la fecha del usurio 
                    String fecha = JOptionPane.showInputDialog(null, "Agregue fecha de nacimiento", "Agregando mascota", JOptionPane.PLAIN_MESSAGE);
                    SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha3 = fecha2.parse(fecha);
                    //ventana que pregunta el precio y cambia el string a int 
                   String precio = JOptionPane.showInputDialog(null, "Agregue precio", "Agregando mascota", JOptionPane.PLAIN_MESSAGE);
                   int precio2= Integer.parseInt(precio);
                    
                    animales ani = new animales(nom,tipo,color,fecha3,precio2); 
                   ani2.add(ani);
                    
                } else if (ani2.size()>100){
                    JOptionPane.showInputDialog("Has alcanzado el limite de mascotas a registrar");
                }
                break;
            }
            case 1: {
               String mensaje = "Elementos de la ArrayList:\n";
                for (int i = 0; i < ani2.size(); i++) {
                    mensaje += ani2.get(i) + "\n";
                }
                JOptionPane.showMessageDialog(null, mensaje, "Elementos de la ArrayList", JOptionPane.INFORMATION_MESSAGE);
                
                break;
            }
            case 2: {
               
                int contador = 0;
                int posicion = 0;
                String nom = JOptionPane.showInputDialog(null, "Ingresa el nombre de mascota a editar", "Editor de mascota", JOptionPane.PLAIN_MESSAGE);
                for (int i = 0; i < ani2.size(); i++) {

                    if (nom.equalsIgnoreCase(ani2.get(i).nombre)) {
                        contador++;
                        posicion = ani2.indexOf(i);
                    }
                }
                if(contador > 0){
                    String[] modi = {"Tipo", "Color", "Fecha de nacimiento", "Precio"};
                    int op2 = JOptionPane.showOptionDialog(null, "Editor de mascotas", "", 0, JOptionPane.QUESTION_MESSAGE, null, modi, input);
                    if (op2 == 0) {
                    String tipo = JOptionPane.showInputDialog(null, "Ingresa el nuevo tipo", "Editor de mascota", JOptionPane.PLAIN_MESSAGE);
                    ani2.get(posicion).setTipo(tipo);
                    }else if (op2 == 1) {
                        Color color ;
                         JColorChooser colorcito = new JColorChooser();
                        color = colorcito.showDialog(null,"Selecciona un color",Color.GRAY);
                        ani2.get(posicion).setColor(color);
                    }else if (op2 == 2) {
                        String fecha = JOptionPane.showInputDialog(null, "Agregue fecha de nacimiento", "Agregando mascota", JOptionPane.PLAIN_MESSAGE);
                        SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha3 = fecha2.parse(fecha);
                        ani2.get(posicion).setFehca(fecha3);
                    }else if (op2 == 3) {
                        String precio = JOptionPane.showInputDialog(null, "Ingresa el nuevo tipo", "Editor de mascota", JOptionPane.PLAIN_MESSAGE);
                        int precio2 = Integer.parseInt(precio);
                        ani2.get(posicion).setPrecio(precio2);
                    }
                }else {
                JOptionPane.showConfirmDialog(null, "Losentimos no pudimos encontrar la mascota","", JOptionPane.PLAIN_MESSAGE);
                }
                break;
            }
            case 3: {
                String nomele = JOptionPane.showInputDialog(null, "Mascota a remover", "Eliminador de mascotas", JOptionPane.PLAIN_MESSAGE);
                for (int i = 0; i < ani2.size(); i++) {
                    if(nomele.contains(ani2.get(i).nombre)){
                    ani2.remove(i);
                    }
                }
                
                break;
            }
            case 4: {
                
                break;
            }
            case 5:{
            
                break;
            }
            case 6:{
            
                break;
            }
            case 7:{
                JOptionPane.showConfirmDialog(null, "Gracias por usar nuestro programa","", JOptionPane.PLAIN_MESSAGE);
                break;
            }
            
        }
        } while (op != 7);
    }
    
}
