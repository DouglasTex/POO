package Questao4;

public class TamDiException extends Exception {
	String msg;
	public TamDiException(){
		msg = "Tamanho diferente";
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
}
