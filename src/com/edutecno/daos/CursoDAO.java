package com.edutecno.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.entidades.CursoDTO;

public class CursoDAO {
	
	public List<CursoDTO> obtieneCursos() throws SQLException, ClassNotFoundException {
		
		//creamos la lista de objetos que devolveran los resultados
		List<CursoDTO> listaDeCursos = new ArrayList<CursoDTO>();
		
		//creamos la consulta a la base de datos
		String consultaSql = " SELECT id_curso, descripcion, precio " 
				   		   + " FROM curso ";
		
		//conexion a la base de datos y ejecucion de la sentencia
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","usuario_prueba","admin");
		Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "GERMAN", "1234");

		
		System.out.println(conexion);
		try(PreparedStatement stmt = conexion.prepareStatement(consultaSql)){
	
			ResultSet resultado = stmt.executeQuery();
			while(resultado.next()) {
				CursoDTO cursoDto = new CursoDTO();
				cursoDto.setIdCurso(resultado.getInt("id_curso"));
				cursoDto.setDescricion(resultado.getString("descripcion"));
				cursoDto.setPrecio(resultado.getDouble("precio"));
				listaDeCursos.add(cursoDto);
			}	
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return listaDeCursos;
	}
}
