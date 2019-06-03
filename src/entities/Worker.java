package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level; //informação da classe do tipo enum
	private Double baseSalary;
	
	private Department department; //informação da classe Department
	//nova lista de contratos instanciadas para este trabalhador
	//vinda da classe hourcontract
	private List<HourContract> contracts = new ArrayList<>(); 
	
	// construtores ---------------------------------------
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	//gets and setters ---------------------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	// não tetm set contracts pois os contratos não podem ser mudados
	
	// métodos de adicionar e remover contratos
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//método para o calculo dos recebimentos do mês
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();//instanciar calendario
		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				sum += c.totalValue(); //método da classe HourContract
			}
		}
		return sum;
		
	}
}
