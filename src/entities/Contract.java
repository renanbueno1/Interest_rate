package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalVauue;
	
	List<Installment> installments = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer number, Date date, Double totalVauue) {
		this.number = number;
		this.date = date;
		this.totalVauue = totalVauue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalVauue() {
		return totalVauue;
	}

	public void setTotalVauue(Double totalVauue) {
		this.totalVauue = totalVauue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
}
