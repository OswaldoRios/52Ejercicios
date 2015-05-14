/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio49;

/**
 * 
 * 49.-Hacer un pseudocodigo que nos permita dar altas en el fichero DATOS.DAT 
 * de organizaci¢n directa, controlando las altas duplicadas. Los campos son:
DNI, NOMBRE, APELLIDOS Y PUNTERO para ambos archivos.
Algoritmo( dn ) =
 Blanco: grabamos el registro en esa posici¢n y ponemos el puntero a cero. 
-	Cero: comprobamos cu l es el valor del campo puntero. Si es cero,
*   grabamos el registro en esa posici¢n (no hay sinonimos) y si es distinto de 
* cero, comparamos el valor con el campo DNI, si son iguales, alta duplicada y
* dejamos de leer, y si no son iguales, introducimos el resto de la informacion. 
-	Distinto de cero: hay un registro grabado en esa posicion. Si es igual 
al dato introducido, alta duplicada, y si no son iguales, comprobamos el valor
* del puntero, si es cero grabamos el registro, y si no es cero, si 
es igual al campo DNI, alta duplicada y sino se graba la informacion en el 
* archivo SINONIMOS.DAT. 

 * 
 * @since 13/5/2015
 * @author ozzIE
 * @version 1.0
 */


public class Numero49 {
    
}
