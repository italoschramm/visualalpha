package com.lealpha.visualalpha.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

public class Util {
	
	public byte[] converteBase64ToByte(String base64) {
		return DatatypeConverter.parseBase64Binary(base64);
	}
	
	public void salvarByteJpeg(byte[] imagemByte, String caminho, String nomeArquivo) {
		ByteArrayInputStream bis = new ByteArrayInputStream(imagemByte);
		BufferedImage image;
		try {
			image = ImageIO.read(bis);
			bis.close();
			File outputfile = new File(caminho + nomeArquivo + ".jpeg");
			ImageIO.write(image, "jpeg", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}