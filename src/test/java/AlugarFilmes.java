import java.util.Calendar;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AlugarFilmes {

	private Filme filme;
	private AluguelService aluguel;
	private NotaAluguel nota;

	
	@Dado("um filme com estoque de {int} unidades")
	public void um_filme_com_estoque_de_unidades(Integer int1) {
	    filme = new Filme();
	    filme.setEstoque(int1);
	}

	@Dado("que o preço de aluguel seja R${int}")
	public void que_o_preço_de_aluguel_seja_r$(Integer int1) {
		filme.setAluguel(int1);
		
	}

	@Quando("alugar")
	public void alugar() {
	  
	}

	@Então("o preço do aluguel será R${int}")
	public void o_preço_do_aluguel_será_r$(Integer int1) {
	}

	@Então("a data de entrega será no dia seguinte")
	public void a_data_de_entrega_será_no_dia_seguinte() {
	    Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, 1);
	}

	@Então("o estoque do filme será {int} unidade")
	public void o_estoque_do_filme_será_unidade(Integer int1) {
	    
	}

}
