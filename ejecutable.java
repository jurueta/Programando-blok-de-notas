
import javax.swing.*;

class PruebaObj{

private String nombre;
private String apellido;
private String cedula;
private int edad;

public void PruebaObj(){

}

public void PruebaObj(String nombre, String apellido,String cedula, int edad){
this.nombre = nombre;
this.apellido = apellido;
this.cedula = cedula
this.edad = edad;

}


@Override
public String toString (){
return "Nombre= "+nombre+" Apellido= "+apellido+"Cedula= "+cedula+" Edad= "+edad;
}
}

public class ejecutable{

public static void main(String[] args){

String nom, ape, cedula;
int edad;
PruebaObj persona = new PruebaObj();
nom = JOptionPane.showInputDialog(null, "Ingrese su nombre");
ape = JOptionPane.showInputDialog(null, "Ingrese su apellido");
cedula = JOptionPane.ShowInputDialog(null,"Ingrese su cedula");
edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));

persona.PruebaObj(nom, ape, cedula, edad);
System.out.println(persona);
}

}


