package edu.escuelaing.arep;
import java.io.IOException;
import java.io.*;
import java.net.*;

/**
 * Es una calculadora que dado un archivo con una fila de datos, calcula la media y desviación estandar de estos.
 * @author Julian Gutierrez
 * @version 1.0 
 */
public class CalculadoraAppWeb {

    /**
	 * Metodo que calcula una funcion matematica aplicada a un numero a partir de una pagina web
	 * 
	 * @param funcion que se quiere realizar
	 * @param numero  al que se le aplicara la funcion
	 * @throws Exception si la funcion no existe 
	 */
	public static String getTrig(String funcion, double numero) throws Exception {
		String urlS = "https://dyno-1-jg.herokuapp.com/calcular?func=" + funcion + "&num=" + numero;
		URL url = new URL(urlS);
		BufferedReader reader= new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine = reader.readLine();
		return inputLine;
    }
	
}