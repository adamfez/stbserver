package fr.univ.rouen.stbserver.model;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class TestSTB {

	public String loadFileXML() {
		StringBuilder message = new StringBuilder();
		Resource resource = new DefaultResourceLoader().getResource("classpath:xml/smallSTB.xml");
		try {
			FileInputStream f = new FileInputStream(resource.getFile());
			int content;
			while ((content = f.read()) != -1) {
				message.append((char) content);
			}
		} catch (IOException e) {
			
		}
		return message.toString();
	}
}
