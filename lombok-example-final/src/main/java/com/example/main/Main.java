package com.example.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.example.model.Persona;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.extern.log4j.Log4j;

@Log4j
public class Main {
	
	
	public static void main(String[] args) {
		try {
			@Cleanup InputStream inputStream = new FileInputStream(new File(""));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void guardar(@NonNull Persona persona) {
		
	}

}
