package org.hcl;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@MultipartConfig(maxFileSize=169999999)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String name=request.getParameter("name");
			Part filePart=request.getPart("photo");
			System.out.println("hello"+" "+name+" "+filePart);
			InputStream inputStream=null;
			if(filePart!=null) {
				long fileSize=filePart.getSize();
				String fileContent=filePart.getContentType();
				inputStream=filePart.getInputStream();
			}
		}
		catch(Exception exe){
			exe.printStackTrace();
			
		}
		
	}

}
