# Project Name:
Healthcare Management using microservices and spring-boot.

# Features:
1. Three microservices: patient-service, appointment-service and billing-service.
2. the appointment-service communicates with the patient-service to get the patient details for booking the appointment.
3. The billing-service communicates with both the patient-service and  appointment-service to get the patient and appointment details respectively for billing.

# Tools Used:
1. Eureka server for registering the three services and to generate the dynamic addresses.
2. Postman for testing the REST API calls using GET, POST, PUT and DELETE methods.
3. MySQL H2 for database.

# Steps to run:
1. Run the eureka server and open the dashboard.
2. Run all the three services and check if they are registered in the eureka dashboard.
3. Open Postman and type the url by setting the method to POST:
 http://localhost:8081/patients
4. Add a patient record entity in the body
  {
  "name": "Alice Smith",
  "contactNumber": "9876543210",
  "address": "123 Main St"
}
5. Create an appointment by the url:
 http://localhost:8082/appointments

  and in the body provide the details:
  {
    "patientId": 1,
    "appointmentDate": "2025-01-16T10:00:00",
    "doctorName": "Dr. Smith",
    "department": "Cardiology"
}

7. Use GET methods for the same URLs to verify whether the data has been inserted 
8. Go to the bill URL and add bill information:
   http://localhost:8083/bills/

   {
    "patientId": 1,
    "appointmentId": 1,
    "amount": 500.00,
    "status": "Unpaid"
  }
  (Make sure the method is POST)

10. After the bill is paid, you can change status to Paid by using PUT method and using the url:
   http://localhost:8083/bills/1?status=Paid
  

