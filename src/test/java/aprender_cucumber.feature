# language: pt
Funcionalidade: Aprender cucember
	Como um aluno
	Eu quero aprender a utilizar cucumber
	Para que eu possa automatizar critérios de aceitação

Cenário: Deve exucutar especificação
	Dado que criei o arquivo corratamento
	Quando executá-lo
	Então a espesificação deve finalizar com sucesso 
	
Cenário: Deve incrementar contador 
	Dado que o valor do contador é 15 
	Quando eu incrementar 3 
	Então o valor do contador será 18
	
Cenário: Deve calcular atraso no prazo de entrega 
	Dado que a entraga é dia 05/04/2018
	Quando a entraga atrasar em 2 dias
	Então a entrega será efetuada em 07/04/2018
	
	Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Fulano da Silva"
    Dado que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar

Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    Dado que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1120,23
    Dado que o nome do passageiro é "Cicrano de Oliveira"
    Dado que o telefone do passageiro é 9888-8888


	
