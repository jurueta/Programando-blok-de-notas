
import javax.swing.*;

class PruebaObj{

private String nombre;
private String apellido;
private int cedula;
private int edad;
private String correo;

public void PruebaObj(){

}

public void PruebaObj(String nombre, String apellido,int cedula, int edad, String correo){
this.nombre = nombre;
this.apellido = apellido;
this.cedula = cedula
this.edad = edad;
this.correo = correo;
}


@Override
public String toString (){
return "Nombre= " + nombre + " Apellido= " + apellido + "Cedula= " + cedula + " Edad= " + edad + " Correo= " + Correo;
}
}

public class ejecutable{

public static void main(String[] args){

String nom, ape, correo;
int edad, cedula;
PruebaObj persona = new PruebaObj();
nom = JOptionPane.showInputDialog(null, "Ingrese su nombre");
ape = JOptionPane.showInputDialog(null, "Ingrese su apellido");
cedula = Integer.parseInt(JOptionPane.ShowInputDialog(null,"Ingrese su cedula"));
edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
correo = JOptionPane.ShowInputDialog(null, "Ingrese su Correo");

persona.PruebaObj(nom, ape, cedula, edad, Correo);
System.out.println(persona);
}

}


