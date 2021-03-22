package Entities;

public class Aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double NotaFinal() {
		return nota1 + nota2 + nota3;
	}

	public void SituacaoFinal() {
		
		if (NotaFinal() >= 60) {
			System.out.printf("FINAL GRADE = %.2f\n", NotaFinal());
			System.out.println("PASS");
		}
		else {
			System.out.printf("FINAL GRADE = %.2f\n", NotaFinal());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", (60.00 - NotaFinal()));
		}
	}

}
