package Secao_11;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class ExemplosDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// Corrigindo o atraso de 3 horas.
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		// Data com horário atual.
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());

		// O java armazena como referência o número de milissegundos desde a meia
		// noite do dia 1 de janeiro de 1970 GMT (UTC);
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);

		// Imprimir datas no padrão instanciado.
		Date y1 = sdf1.parse("29/11/1994");
		Date y2 = sdf2.parse("29/11/1994 15:42:07");

		// Padrão UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("---------------------------");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		// Máquinas no Brasil informam o horário com 3 horas de atraso devido ao
		// fuso horário.
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		// Horário UTC com 3 horas de atraso
		System.out.println("y3: " + sdf2.format(y3));

		System.out.println("---------------------------");
		//Datas em padrão UTC sem as 3 horas de atraso.
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));

		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));

		System.out.println("y3: " + sdf3.format(y3));
		
		System.out.println("---------------------------");
		//Datas sem formatação.
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);

		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);

		System.out.println("y3: " + y3);


	}

}
