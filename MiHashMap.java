import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // instance variables - replace the example below with your own
    private String key[];
    private int valores[];

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        valores = new int[0];
        key = new String [0];
    }

    /**
     * Asocia el valor especificado con la clave especificada. 
     * Si la clave existía, entonces sobreescribe su valor y devuelve 
     * el valor antiguo. Si no existía devuelve -1.
     */
    public void put(String clave, int valor)
    {
        int indexKey = 0; //Indice para las key
        int indexValue = 0; // Indice para los valores
        if(key.length == 0 && valores.length== 0)
        {
            valores = new int[valores.length+1];
            key = new String [key.length+1];
            key[indexKey] = clave;
            valores[indexValue] = valor;
        }
        else
        {
            String tempKey[] = new String[key.length + 1];
            int tempValores[] = new int[valores.length +1];
            for(int i = 0; i < key.length; i++)
            {
                tempKey[i] = key[i];
                tempValores[i] = valores[i];
                tempKey[tempKey.length-1] = clave;
                tempValores[tempValores.length-1] = valor;
            }
            key = tempKey;
            valores = tempValores;
        }
    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de 
     * que la clave no exista.
     */
    public int get(String clave)
    {
        int devolver = -1;
        for(int i=0; i<valores.length; i++)
        {
            String temp = key[i]; 
            if(temp == clave)
            {
                devolver = valores[i];
            }
        }
        
        return devolver;
    }
    
    /**
     * Metodo que devuelve true si el mapa no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean b = true;
        if(key.length >= 0 && valores.length >=0)
        {
             b = false;
        }
        return b;
    }
    
    /**
     * devuelve el número de elementos del mapa.
     */
    public int size()
    {
        int numeroDeElementos = 0;
        for(int i =0; i < valores.length; i++)
        {
            numeroDeElementos++;
        }
        return numeroDeElementos;
    }
    
    /**
     * Metodo que elimina del mapa el elmento con la clave dada y devuelve su valor
     * si no existe esa clave devuelve -1
     */
    public void remove(String clave)
    {
    
    
    }
}
