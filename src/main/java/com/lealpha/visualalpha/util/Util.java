package com.lealpha.visualalpha.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public Date stringToDate(String data) {
		try {
			Date date = (Date) new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(data);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}  
	}
	
	public String dateToString(Date data) throws ParseException{
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		return date.format(data); 
		 
	}
	
	public String segundosToHora(int segundos) {
	    int hours = segundos / 3600;
	    int remainder = segundos - hours * 3600;
	    int mins = remainder / 60;
	    remainder = remainder - mins * 60;
	    int secs = remainder;

	    return (String.format("%02d", hours) + ":" + String.format("%02d", mins) + ":" + String.format("%02d", secs));
	    //int[] ints = {hours , mins , secs};
	}
	
	public float convMsToKms(float velocidade) {
		return (float) (velocidade * 3.6);
	}
	 
	public String calculaPace(float velocidadeMedia) {	
		if (velocidadeMedia != 0) {
			float valor = (1/convMsToKms(velocidadeMedia)) * 60;
			String valorFixo = String.format("%.2f",valor);
			int posVirgula = valorFixo.indexOf(",");
			String primeiroValor = valorFixo.substring(0, posVirgula);
			String segundoValor = valorFixo.substring(posVirgula+1, posVirgula + 3);
			segundoValor = String.format("%.0f", (Float.valueOf(segundoValor)*60)/100);
			return primeiroValor + ":" + segundoValor;
		}else {
			return "0.0";
		}
		
	}
	
	public String convMetroToKm(float valor) {
		return (String.format("%.2f", (valor/1000)));
	}
}