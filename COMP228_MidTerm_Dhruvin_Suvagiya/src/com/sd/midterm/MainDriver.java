
package com.sd.midterm;

public class MainDriver {

	public static void main(String[] args) {

		// 1: Register at least two patients
		System.out.println("Patients");
		System.out.println();
		Patient patient1 = new Patient(1, "patient1", "12345678901", 101, 25, "Medical Department - A", 150);
		Patient patient2 = new Patient(2, "patient2", "1234567890", 102, 35, "Medical Department - B", 200);
		patient1.registerPatient("patient1", 25);
		patient2.registerPatient("patient2", 35, "Medical Department - B");

		// 2. one doctor, one spe_doctorm and one nurse objects
		Doctor doctor = new Doctor(3, "Doctor", "1234567890", 101, "General", 5000, 100, 20);
		SpecialistDoctor spe_doct = new SpecialistDoctor(4, "SpecialistDoctor", "1234567890", 102, "Department-A", 7000,
				150, 25, "Specialization-A", 50);
		Nurse nurse = new Nurse(5, "Nurse", "1234567890", 103, "Emergency", 4000, "Night", 500);

		// runtime polymorphism
		MedicalStaff staff1 = doctor;
		MedicalStaff staff2 = spe_doct;
		MedicalStaff staff3 = nurse;

		// 3 patient and staff details
		patient1.displayPatientDetails();
		System.out.println();
		patient2.displayPatientDetails();
		System.out.println();
		staff1.displayStaffDetails();
		System.out.println();
		staff2.displayStaffDetails();
		System.out.println();
		staff3.displayStaffDetails();
		System.out.println();

		// 4: overloading consultation fee methods
		System.out.println("Consultation Fees");
		System.out.println("Fee: " + doctor.calculateConsultationFee());
		System.out.println("With Discount: " + doctor.calculateConsultationFee(20));
		System.out.println("With Additional Charge: " + doctor.calculateConsultationFee(20, 30));
		System.out.println();

		// 5.monthly compensation for each staff
		System.out.println("Monthly Compensation");
		System.out.println("Doctor: " + staff1.calculateMonthlyCompensation());
		System.out.println("Specialist Doctor: " + staff2.calculateMonthlyCompensation());
		System.out.println("Nurse: " + staff3.calculateMonthlyCompensation());
		System.out.println();

		// 6. Counts
		System.out.println("Counts");
		System.out.println("Registered People: " + Person.getPersonCount());
		System.out.println("Registered Patients: " + Patient.getPatientCount());
		System.out.println("Registered Staff: " + MedicalStaff.getStaffCount());
		System.out.println();

		// 7.runtime polymorphism
		System.out.println("Runtime Polymorphism");
		System.out.println(staff1.getRoleDescription());
		System.out.println("Compensation: " + staff1.calculateMonthlyCompensation());
		System.out.println(staff2.getRoleDescription());
		System.out.println("Compensation: " + staff2.calculateMonthlyCompensation());
		System.out.println(staff3.getRoleDescription());
		System.out.println("Compensation: " + staff3.calculateMonthlyCompensation());
		System.out.println();

		// 8 interfaces
		System.out.println("Interfaces");
		spe_doct.generateReport();
		spe_doct.scheduleAppointment("11-11-1111");
		System.out.println();

		// 9. Display successful and unsuccessful messages
		System.out.println("Patient registration completed successfully.");
		String appointmentDate = "";
		if (appointmentDate.isEmpty()) {
			System.out.println("Appointment scheduling failed: date is required.");
		}

		/*
		
		 //Test Cases 
		System.out.println("Test Case");
		 
		 //1: patient registration is successfull or not
		 System.out.println("1 Successful Patient Registration");
		 patient1.registerPatient("patient1", 25);
		 
		 //2: Invalid patient age 
		System.out.println("2 Invalid Patient Age");
		 patient1.registerPatient("patient1", -5);
		 
		 //3: Consultation fee with and without discount
		  System.out.println("3: Consultation Fee");
		  System.out.println("Without Discount: " + doctor.calculateConsultationFee());
		  System.out.println("With Discount: " + doctor.calculateConsultationFee(20));
		 
		 //4: Monthly compensation for different staffs
		  System.out.println("4: Monthly Compensation");
		  System.out.println("Doctor: "+ staff1.calculateMonthlyCompensation());
		 System.out.println("Specialist Doctor: " + staff2.calculateMonthlyCompensation());
		 System.out.println("Nurse: " +staff3.calculateMonthlyCompensation());
		 
		  //5: Static count System.out.println("5: Static Count");
		  System.out.println("Registered People: " + Person.getPersonCount());
		 System.out.println("Registered Patients: " + Patient.getPatientCount());
		  System.out.println("Registered Staff: " + MedicalStaff.getStaffCount());
		  
		 */
	}
}
