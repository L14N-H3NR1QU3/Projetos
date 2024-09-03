programa
{
	inteiro vet[20]
	funcao inicio()
	{
	/*Escreva um algoritmo em PORTUGOL que armazene em um vetor o quadrado dos
	números ímpares no intervalo fechado de 1 a 20. Após isso, o algoritmo deve imprimir todos
	os valores armazenados*/
	para(inteiro i = 0; i < 20; i++){
		se((i)%2 != 0){
			vet[i] = (i*i)
		}
	}
	para(inteiro i = 0; i < 20; i++){
		escreva(vet[i], "\n")	
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */