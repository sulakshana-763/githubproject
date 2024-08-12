package day02;

public class EmployeeSalary {
	
	double basic;
	double boa;
	double bonus;
	double pf;
	double monthlyGross;
	double yearlyGross;
	double monthlyTax;
	double monthlyTakeOut;
	double taxRate;
	
	double pf(double basic) {
		pf = basic*0.12;
		System.out.println(pf);
		return pf;
	}
	
	
	double monthlyGross(double basic, double boa, double bonus) {
		monthlyGross = (basic + boa + bonus) - pf;
		System.out.println(monthlyGross);
		return monthlyGross;
	}
	
	double yearlyGross() {
		yearlyGross = monthlyGross*12;
		System.out.println(yearlyGross);
		return yearlyGross;
	}	
		
	double yearlyTax(double basic) {
		if(yearlyGross<250000) {
		taxRate = 0;
		}else if(yearlyGross>250000 && yearlyGross < 500000) {
			taxRate = yearlyGross*5/100;
		}
		else if(yearlyGross>500000 && yearlyGross < 750000) {
			taxRate = yearlyGross*10/100;
		}
		else if(yearlyGross>750000 && yearlyGross < 1000000) {
			taxRate = yearlyGross*15/100;
		}
		else if(yearlyGross>1000000 && yearlyGross < 1250000) {
			taxRate = yearlyGross*20/100;
		}
		else if(yearlyGross>1250000 && yearlyGross < 1500000) {
			taxRate = yearlyGross*25/100;
		}
		else if(yearlyGross>1500000) {
			taxRate = yearlyGross*30/100;
		}		
		System.out.println(taxRate);		
		return taxRate;
	}
	
	double monthlyTax() {
		monthlyTax = taxRate/12;
		System.out.println(monthlyTax);
		return monthlyTax;
	}
	
	double monthlyTakeOut(double basic) {
		monthlyTakeOut = monthlyGross - monthlyTax;
		System.out.println(monthlyTakeOut);
		return monthlyTakeOut;
	}

	public static void main(String[] args) {
		
		EmployeeSalary employeeLevel1 = new EmployeeSalary();
		EmployeeSalary employeeLevel2 = new EmployeeSalary();
		EmployeeSalary employeeLevel3 = new EmployeeSalary();
		EmployeeSalary employeeLevel4 = new EmployeeSalary();
		
		employeeLevel1.pf(7000);
		employeeLevel1.monthlyGross(7000, 5000, 2000);
		employeeLevel1.yearlyGross();
		employeeLevel1.monthlyTax();
		employeeLevel1.yearlyTax(7000);
		employeeLevel1.monthlyTakeOut(7000);
		
		employeeLevel2.pf(10000);
		employeeLevel2.monthlyGross(10000, 7000, 2500);
		employeeLevel2.yearlyGross();
		employeeLevel2.monthlyTax();
		employeeLevel2.yearlyTax(10000);
		employeeLevel2.monthlyTakeOut(10000);
		
		
		employeeLevel3.pf(12000);
		employeeLevel3.monthlyGross(12000, 9000, 3000);
		employeeLevel3.yearlyGross();
		employeeLevel3.monthlyTax();
		employeeLevel3.yearlyTax(12000);
		employeeLevel3.monthlyTakeOut(12000);
		
		employeeLevel4.pf(15000);
		employeeLevel4.monthlyGross(15000, 10000, 3500);
		employeeLevel4.yearlyGross();
		employeeLevel4.monthlyTax();
		employeeLevel4.yearlyTax(15000);
		employeeLevel4.monthlyTakeOut(15000);

	}

}
