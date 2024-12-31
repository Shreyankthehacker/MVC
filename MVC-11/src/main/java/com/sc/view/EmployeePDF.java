package com.sc.view;

import java.util.List;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.sc.model.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("pdfreport")
public class EmployeePDF extends  AbstractPdfView{

	

	@Override
	protected void buildPdfDocument(Map<String, Object> mp, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// get Model attribute data 
		List<Employee> list = (List<Employee>) mp.get("empsList");
		
		Paragraph para = new Paragraph("Employee report",new Font(Font.BOLDITALIC));
		document.add(para);
		
		Table table = new Table(4,list.size()); // 4 columns because ID , name , job , salary
		for(Employee emp : list) {
			table.addCell(emp.getEmpId().toString());
			table.addCell(emp.getName());
			table.addCell(emp.getJob());
			table.addCell(emp.getSalary().toString());
			System.out.println(emp.toString());
		}
		document.add(table);
		
	}

	
}
