/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

/**
 *
 * @author alumnocbi
 */
import java.sql.Connection;
import java.sql.Statement;

public class CreadorBaseDeDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		try
		{
			Connection connection = ManejadorBD.dameConnection();

			Statement statement = connection.createStatement();
			statement.execute("create table Autores(autorId INTEGER PRIMARY KEY not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), nombre varchar(40), apellido varchar(40), anio int)"); // , CONSTRAINT primary_key PRIMARY KEY (autorId)
			System.out.println("Tabla de Autores creada exitosamente");
			statement.execute("create table Libros(nombre varchar(40), precio double precision, autor int)");
			System.out.println("Tabla de Libros creada exitosamente");

			ManejadorBD.termina();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}




	}

}