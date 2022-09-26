package com.sys.appointmentsystemv0;

import com.sys.appointmentsystemv0.model.*;
import com.sys.appointmentsystemv0.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.*;

@SpringBootApplication
public class Application
{
    public static void main(String[] args)
    { ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(Application.class);
        EmployeeDataRepository employeeDataRepository = configurableApplicationContext.getBean(EmployeeDataRepository.class);
        RepresentativeDataRepository representativeDataRepository = configurableApplicationContext.getBean(RepresentativeDataRepository.class);
        OperatorDataRepository operatorDataRepository = configurableApplicationContext.getBean(OperatorDataRepository.class);
        AppointmentDataRepository appointmentDataRepository = configurableApplicationContext.getBean(AppointmentDataRepository.class);
        AdminDataRepository adminDataRepository =configurableApplicationContext.getBean(AdminDataRepository.class);
        EmailOfRepresentativesDataRepository emailOfRepresentativesDataRepository =configurableApplicationContext.getBean(EmailOfRepresentativesDataRepository.class);
        EmployeeData empInput=new EmployeeData(101L,"Fahad","Al-something","Fahag","fahg@company.co","Employee","1990/04/03","123");
        List<EmployeeData> employeeData= Arrays.asList(empInput);
        employeeDataRepository.saveAll(employeeData);

        AdminData adminInput=new AdminData(11L,"Ghazy","Al-something","Ghaag","ghaag@company.co","Admin","1990/04/03","123");
        RepresentativeData repInput=new RepresentativeData(201L,"Fhaad","Al-something","Fhaag","fhaag@company.co","Representative","1990/04/03","123");
        OperatorData opInput=new OperatorData(301L,"Mohammed","Al-something","mohag","moahg@company.co","Operator","1990/04/03","123");
        AppointmentData FDateInput=new AppointmentData(1001L,"First","Approved","Approved","Accepted the first date","2022/08/04","no new date");
        AppointmentData SDateInput=new AppointmentData(1002L,"Second","Approved","Decline",FDateInput.DeclineReason(FDateInput.getSortedDate()),"2022/08/05","no new date");
        AppointmentData TDateInput=new AppointmentData(1003L,"Third","Approved","Decline",FDateInput.DeclineReason(FDateInput.getSortedDate()),"2022/08/08","no new date");
        AppointmentData NDateInput=new AppointmentData(1004L,"Third","Approved","Decline",FDateInput.DeclineReason(FDateInput.getSortedDate()),"2022/08/10","no new date");
        EmailOfRepresentativesData EORD =new EmailOfRepresentativesData(10001l,"fhaag@representative.co","Fhaad Al-something","Approved");

        Set<AppointmentData> dateOfAppointments=new HashSet<>();
        dateOfAppointments.add(FDateInput);
        dateOfAppointments.add(SDateInput);
        dateOfAppointments.add(TDateInput);
//        (FDateInput,SDateInput,TDateInput,NDateInput);

        List<RepresentativeData> representativeData= Arrays.asList(repInput);
        representativeDataRepository.saveAll(representativeData);
        operatorDataRepository.save(opInput);
        FDateInput.setEmployeeData(employeeDataRepository.findByUserName("Fahag"));
        FDateInput.setRepresentativeData(repInput);
        FDateInput.setOperatorData(opInput);
        SDateInput.setEmployeeData(employeeDataRepository.findByUserName("Fahag"));
        SDateInput.setRepresentativeData(repInput);
        SDateInput.setOperatorData(opInput);
        TDateInput.setEmployeeData(employeeDataRepository.findByUserName("Fahag"));
        TDateInput.setRepresentativeData(repInput);
        TDateInput.setOperatorData(opInput);
        appointmentDataRepository.saveAll(dateOfAppointments);
//        empInput.addAppointmentData(SDateInput);
        employeeDataRepository.save(empInput);
        adminDataRepository.save(adminInput);
        EORD.setAdminData(adminInput);
        EORD.setEmployeeData(empInput);
        emailOfRepresentativesDataRepository.save(EORD);

       String appointmentID =appointmentDataRepository.findById(FDateInput.getDate_id()).toString();
        System.out.println(appointmentID);
        System.out.println(appointmentDataRepository.findByDate(FDateInput.getDate()).toString()+"    "+FDateInput.getDate());
        System.out.println(appointmentDataRepository.findBySortedDate(FDateInput.getSortedDate())+"    "+FDateInput.getSortedDate());
        System.out.println(appointmentDataRepository.findByDateStatus(FDateInput.getDateStatus())+"    "+FDateInput.getDateStatus());
        System.out.println(appointmentDataRepository.findByReason(FDateInput.getReason())+"    "+FDateInput.getReason());
        System.out.println(appointmentDataRepository.findByNewDateAndId(FDateInput.getNewDate(),FDateInput.getDate_id())+"    "+FDateInput.getNewDate());
        System.out.println(appointmentDataRepository.findByApprovedWorkFlowAndId(FDateInput.getApprovedWorkFlow(),FDateInput.getDate_id())+"    "+FDateInput.getApprovedWorkFlow());
        System.out.println(appointmentDataRepository.findByEmployeeDataAndId(empInput, FDateInput.getDate_id())+"   EmployeeData:  "+employeeDataRepository.findById(101L));
        System.out.println(appointmentDataRepository.findByRepresentativeDataAndId(repInput,FDateInput.getDate_id())+"   RepresentativeData:  "+repInput);
        System.out.println(appointmentDataRepository.findByOperatorDataAndId(opInput,FDateInput.getDate_id())+"    OperatorData:  "+opInput);
        List allDataApp= Collections.singletonList(appointmentDataRepository.findAll().toString() + "all Data");
        System.out.println(allDataApp);

        String employeeDataID=employeeDataRepository.findById(empInput.getEmployee_id()).toString();
        System.out.println(employeeDataID);
        System.out.println(employeeDataRepository.findByFirstName(empInput.getFirstName())+"   "+empInput.getFirstName());
        System.out.println(employeeDataRepository.findByLastName(empInput.getLastName())+"   "+empInput.getLastName());
        System.out.println(employeeDataRepository.findByUserName(empInput.getUserName())+"   "+empInput.getUserName());
        System.out.println(employeeDataRepository.findByEmail(empInput.getEmail())+"   "+empInput.getEmail());
        System.out.println(employeeDataRepository.findByUserRole(empInput.getUserRole())+"   "+empInput.getUserRole());
        System.out.println(employeeDataRepository.findByDateOfBirth(empInput.getDateOfBirth())+"   "+empInput.getDateOfBirth());
        String allData=employeeDataRepository.findAll().toString() + "all Data";
        System.out.println(allData);

        String representativeDataID =representativeDataRepository.findById(repInput.getRepresentativeId()).toString();
        System.out.println(representativeDataID);
        System.out.println(representativeDataRepository.findByFirstName(repInput.getFirstName())+"   "+repInput.getFirstName());
        System.out.println(representativeDataRepository.findByLastName(repInput.getLastName())+"   "+repInput.getLastName());
        System.out.println(representativeDataRepository.findByUserName(repInput.getUserName())+"   "+repInput.getUserName());
        System.out.println(representativeDataRepository.findByEmail(repInput.getEmail())+"   "+repInput.getEmail());
        System.out.println(representativeDataRepository.findByUserRole(repInput.getUserRole())+"   "+repInput.getUserRole());
        System.out.println(representativeDataRepository.findByDateOfBirth(repInput.getDateOfBirth())+"   "+repInput.getDateOfBirth());

        String operatorDataID =operatorDataRepository.findById(opInput.getId()).toString();
        System.out.println(operatorDataID);
        System.out.println(operatorDataRepository.findByFirstName(opInput.getFirstName())+"   "+opInput.getFirstName());
        System.out.println(operatorDataRepository.findByLastName(opInput.getLastName())+"   "+opInput.getLastName());
        System.out.println(operatorDataRepository.findByUserName(opInput.getUserName())+"   "+opInput.getUserName());
        System.out.println(operatorDataRepository.findByEmail(opInput.getEmail())+"   "+opInput.getEmail());
        System.out.println(operatorDataRepository.findByUserRole(opInput.getUserRole())+"   "+opInput.getUserRole());
        System.out.println(operatorDataRepository.findByDateOfBirth(opInput.getDateOfBirth())+"   "+opInput.getDateOfBirth());

        String adminDataID =adminDataRepository.findById(adminInput.getId()).toString();
        System.out.println(adminDataID);
        System.out.println(adminDataRepository.findByFirstName(adminInput.getFirstName())+"   "+adminInput.getFirstName());
        System.out.println(adminDataRepository.findByLastName(adminInput.getLastName())+"   "+adminInput.getLastName());
        System.out.println(adminDataRepository.findByUserName(adminInput.getUserName())+"   "+adminInput.getUserName());
        System.out.println(adminDataRepository.findByEmail(adminInput.getEmail())+"   "+adminInput.getEmail());
        System.out.println(adminDataRepository.findByUserRole(adminInput.getUserRole())+"   "+adminInput.getUserRole());
        System.out.println(adminDataRepository.findByDateOfBirth(adminInput.getDateOfBirth())+"   "+adminInput.getDateOfBirth());

        String emailRepID =emailOfRepresentativesDataRepository.findById(EORD.getId()).toString();
        System.out.println(emailRepID);
        System.out.println(emailOfRepresentativesDataRepository.findByEmailOfRep(EORD.getEmailOfRep())+"   "+EORD.getEmailOfRep());
        System.out.println(emailOfRepresentativesDataRepository.findByNameOfRep(EORD.getNameOfRep())+"   "+EORD.getNameOfRep());
        System.out.println(emailOfRepresentativesDataRepository.findByAdminApproved(EORD.getAdminApproved())+"   "+EORD.getAdminApproved());
//        System.out.println(emailOfRepresentativesDataRepository.findByAdminData(adminInput)+"   "+adminInput);
//        System.out.println(emailOfRepresentativesDataRepository.findByEmployeeData(empInput)+"   "+empInput);
    }

}