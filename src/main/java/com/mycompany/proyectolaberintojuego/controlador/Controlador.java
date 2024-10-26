/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolaberintojuego.controlador;

import com.mycompany.proyectolaberintojuego.view.GUIHistoria;
import com.mycompany.proyectolaberintojuego.view.GUIInstrucciones;
import com.mycompany.proyectolaberintojuego.view.GUIPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dayio
 */
public class Controlador implements ActionListener {
    
    
 private GUIHistoria guiHistoria;
 private GUIInstrucciones guiInstrucciones;              
 private GUIPrincipal guiPrincipal;

    public Controlador() {
      guiPrincipal = new GUIPrincipal(this);
      guiInstrucciones = new GUIInstrucciones(this, guiPrincipal);
      guiHistoria = new GUIHistoria(this, guiPrincipal);
      guiPrincipal.setVisible(true);
    }
   public void mostrarGUIPrincipal (){
       guiPrincipal.setVisible(true);
   }
    
    @Override
    public void actionPerformed(ActionEvent e) { 
        
    
        
    switch (e.getActionCommand()){
        
        case "btnJugar":
                break;
                
                
        case "btnInstrucciones":
            guiInstrucciones.setVisible(true);
            guiPrincipal.setVisible(false);
                break;
                
                
        case "btnSalir":
            
            System.exit(0);
            
                break;
                
                
        case "btnHistoria":
             guiHistoria.setVisible(true);
            guiPrincipal.setVisible(false);
            break;
    }   
    }
    
}
