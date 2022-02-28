package com.edutecno.facade;

import java.sql.SQLException;
import java.util.List;

import com.edutecno.daos.CursoDAO;
import com.edutecno.daos.FormaDePagoDAO;
import com.edutecno.daos.InscripcionDAO;
import com.edutecno.entidades.CursoDTO;
import com.edutecno.entidades.FormaDePagoDTO;
import com.edutecno.entidades.InscripcionDTO;

public class Facade {
	
	public int registrarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
		InscripcionDAO dao = new InscripcionDAO();
		return dao.insertarInscripcion(dto);
	}
	
	public List<CursoDTO> obtenerCursos() throws SQLException, ClassNotFoundException{
		CursoDAO dao = new CursoDAO();
		return dao.obtieneCursos();
	}
	
	public List<FormaDePagoDTO> obtenerFormasDePago() throws SQLException, ClassNotFoundException{
		FormaDePagoDAO dao = new FormaDePagoDAO();
		return dao.obtieneFormasDePago();
	}
}
