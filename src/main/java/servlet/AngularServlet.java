package servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import beans.UpdateProduction;

public class AngularServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			UpdateProduction updateProduction = new Gson().fromJson(request.getReader(), UpdateProduction.class);
			if (request.getRequestURI().endsWith("updateInputStatement.ang")) {

				// Input
				updateProduction.getInputStatement();
				updateProduction.setOutputStatement("generated output");

			} else if (request.getRequestURI().endsWith("getCount.ang")) {

				updateProduction.setCount(600);

			} else if (request.getRequestURI().endsWith("executeUpdateStatement")) {

			}
			String json = new Gson().toJson(updateProduction);
			response.setContentType("application/json");
			response.getWriter().write(json);
			response.setStatus(300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("get request");
		UpdateProduction updateProduction = new UpdateProduction();
		try {
			if (request.getRequestURI().endsWith("getCount.ang")) {

				updateProduction.setCount(600);

			} else if (request.getRequestURI().endsWith("executeUpdateStatement")) {

			}
			String json = new Gson().toJson(updateProduction);
			response.setContentType("application/json");
			response.getWriter().write(json);
			response.setStatus(300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
