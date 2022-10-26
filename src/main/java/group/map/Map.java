/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package group.map;

import java.util.HashMap;

/**
 *
 * @author David
 */
public class Map {

    public static void main(String[] args) {
        //Usamos Map para crear la lista de salarios e imprimarlos al cuadrado
        HashMap<Integer, Integer> salaries = new HashMap<>();
        
        salaries.put(1, 10);
        salaries.put(2, 90);
        salaries.put(3, 50);
        salaries.put(4, 55);
        salaries.put(5, 62);
        
        //salaries.forEach((k,v) -> System.out.println(v*v));
        salaries.forEach((k,v) -> salaries.replace(k, v*v));
        System.out.println(salaries.values());
    }
}
