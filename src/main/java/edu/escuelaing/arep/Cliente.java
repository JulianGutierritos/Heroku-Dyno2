package edu.escuelaing.arep;
import java.io.IOException;
import java.io.*;
import java.net.*;


/**
 * Es un cliente para probar nuestro apirest
 * @author Julian Gutierrez
 * @version 1.0 
 */
public class Cliente {

    /**
	 * Metodo principal que realiza peticiones y las imprime
	 * @throws Exception si alguna url no existe
	 */
	public static void probar() throws Exception {
        System.out.println("Calcular el coseno de 1");
		String urlS = "https://dyno-2-jg.herokuapp.com/calcular?func=cos&num=1";
		URL url = new URL(urlS);
		BufferedReader reader= new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine = reader.readLine();
        System.out.println(inputLine);
        System.out.println("Calcular el seno de 1");
		urlS = "https://dyno-2-jg.herokuapp.com/calcular?func=sin&num=1";
		url = new URL(urlS);
		reader= new BufferedReader(new InputStreamReader(url.openStream()));
	    inputLine = reader.readLine();
        System.out.println(inputLine);
        System.out.println("Calcular la tangente de 1");
		urlS = "https://dyno-2-jg.herokuapp.com/calcular?func=tan&num=1";
		url = new URL(urlS);
		reader= new BufferedReader(new InputStreamReader(url.openStream()));
	    inputLine = reader.readLine();
        System.out.println(inputLine);
    }
}
