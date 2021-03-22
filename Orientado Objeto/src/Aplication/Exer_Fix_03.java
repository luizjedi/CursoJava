package Aplication;

import java.util.Scanner;
import java.util.Locale;
import Entities.Aluno;

public class Exer_Fix_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.SituacaoFinal();
		
		sc.close();
	}

}
