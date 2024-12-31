package com.sc.view;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import org.apache.poi.ss.usermodel.Row;
import com.sc.model.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component("excelreport")
public class EmployeeExcelView extends AbstractXlsView{
private static  int i = 0;
	@Override
	protected void buildExcelDocument(Map<String, Object> mp, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Employee> list = (List<Employee>) mp.get("empsList");
		Sheet sheet = workbook.createSheet("Sheet");

		for(Employee emp:list) {
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(emp.getEmpId());
			row.createCell(1).setCellValue(emp.getName());
			row.createCell(2).setCellValue(emp.getJob());
			row.createCell(3).setCellValue(emp.getSalary());

			i++;
			
		}
	}

}
