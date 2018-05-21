package com.yourcompany.struts.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import org.apache.struts.upload.FormFile;

public class FileUpload {
	public static String FileUtil(FormFile f,String filePath){
		File file = new File(filePath);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		try {
			InputStream input = f.getInputStream();
			OutputStream output = new FileOutputStream(file);
			byte data[] = new byte [1024];
			int temp = 0;
			while((temp = input.read(data)) != -1){
				output.write(data,0,temp);
			}
			input.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
