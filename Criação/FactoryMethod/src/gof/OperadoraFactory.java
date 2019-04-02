package gof;

import gof.operadoras.Claro;
import gof.operadoras.Oi;
import gof.operadoras.Tim;
import gof.operadoras.Vivo;

public class OperadoraFactory implements Factory{
	public Operadora criar(Tipo tipo) {
		if (tipo == Tipo.VIVO) return new Vivo();
		else if (tipo == Tipo.OI) return new Oi();
		else if (tipo == Tipo.TIM) return new Tim();
		else if (tipo == Tipo.CLARO) return new Claro();
		else return null;
	}
}
