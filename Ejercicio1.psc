Algoritmo Ejercicio1
	
	Definir N, pares, impares Como Entero
	
	Escribir "Ingrese un n�mero: "
	Leer N
	
	Para i<-1 Hasta N Con Paso 1 Hacer
		numAleatorio <- Aleatorio(1,100)
		Si numAleatorio MOD 2 = 0 Entonces
			pares <- pares + 1
		SiNo
			impares <- impares + 1
		Fin Si
	Fin Para
	
	Escribir "Total de n�meros pares: " , pares
	Escribir "Total de n�meros impares: " , impares
	
FinAlgoritmo
