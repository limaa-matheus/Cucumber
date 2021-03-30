import java.util.Calendar;
import java.util.Date;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
	
	@Dado("que criei o arquivo corratamento")
	public void que_criei_o_arquivo_corratamento() {
	   
	}

	@Quando("executá-lo")
	public void executá_lo() {
	   
	}

	@Então("a espesificação deve finalizar com sucesso")
	public void a_espesificação_deve_finalizar_com_sucesso() {
	    
	}
	
	private int contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(Integer int1) {
		contador = int1;
	  
	}

	@Quando("eu incrementar {int}")
	public void eu_incrementar(Integer int1) {
		contador = contador + int1;
	    
	}

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(Integer int1) {
		System.out.println(int1);
		System.out.println(contador);
	   
	}
	
	Date entrega = new Date();
	
	@Dado("que a entraga é dia {int}\\/{int}\\/{int}")
	public void que_o_prazo_é_dia(int dia, int mes, int ano) {
	  Calendar cal = Calendar.getInstance();
	  cal.set(Calendar.DAY_OF_MONTH, dia);
	  cal.set(Calendar.MONTH, mes);
	  cal.set(Calendar.YEAR, ano);
	  entrega = cal.getTime();

	}

	@Quando("a entraga atrasar em {int} dias")
	public void a_entraga_atrasar_em_dias(int int1) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, int1);
		  entrega = cal.getTime();

	}

	@Então("a entrega será efetuada em {int}\\/{int}\\/{int}")
	public void a_entrega_será_efetuada_em(int int1, int int2, int int3) {
	    
	}
	
	@Dado("que o ticket é AF345")
	public void que_o_ticket_é_af345() {
	  
	}

	@Dado("que o valor da passagem é R$ {double}")
	public void que_o_valor_da_passagem_é_r$(Double double1) {
	    
	}

	@Dado("que o nome do passageiro é {string}")
	public void que_o_nome_do_passageiro_é(String string) {
	   
	}

	@Dado("que o telefone do passageiro é {int}-{int}")
	public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {
	  
	}

	@Quando("criar os steps")
	public void criar_os_steps() {
	 
	}

	@Então("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	
	}
	
	@Dado("que o ticket é AB167")
	public void que_o_ticket_é_ab167() {
	   
	}

	@Dado("que o ticket especial é AB167")
	public void que_o_ticket_especial_é_ab167() {
	  
	}

}

