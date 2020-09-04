package edu.escuelaing.arep;


import static spark.Spark.*;
import java.util.concurrent.TimeUnit;

/**
 * Clase que permite activar un servicio web ligero.
 * @author Julian Gutierrez
 * @version 1.0 
 */

public class SparkWebApp {

	/** 
	* Metodo principal que define la ruta de los archivos estaticos, abre un puerto y define un servicio get para la ruta /calcular. 
	*/
	public static void main(String[] args) {
		 port(getPort());
		 staticFiles.location("/static");
		 get("calcular", "application/json", (req, res) -> {
			String funcion = req.queryParams("func");
			String numero = req.queryParams("num");
			try {
				double num = Double.parseDouble(numero);
				String resp = CalculadoraAppWeb.getTrig(funcion, num);
				res.type("application/json");
				return resp;
			} catch (Exception e){
				res.status(404);
				return null;
			}
		});
		try{
			TimeUnit.SECONDS.sleep(3);
			Cliente.probar();
		}catch (Exception e){}
	}
	
	/** 
	* Metodo que retorna un puerto
	* @return int con el numero del puerto a utilizar
	*/
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
	}
}