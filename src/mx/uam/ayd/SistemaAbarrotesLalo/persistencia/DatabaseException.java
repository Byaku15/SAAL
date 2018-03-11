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
public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	Exception m_realException;

	DatabaseException(String msg, Exception ex)
	{
		super(msg);
		m_realException = ex;
	}
	
	public Exception getRealException()
	{
		return m_realException;
	}
	
}
