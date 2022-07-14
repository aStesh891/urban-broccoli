package urban.broccoli.streamapi;

import lombok.extern.slf4j.Slf4j;
import urban.broccoli.streamapi.model.Specialist;
import urban.broccoli.streamapi.model.Specialty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OldWayUtil {
  public static List<Specialist> getSpecialists() {
    List<Specialist> result = new ArrayList<>();
    result.add(new Specialist("Ivan Franko", new BigDecimal(15000), Specialty.DEVELOPER));
    result.add(new Specialist("Lesya Ukrainka", new BigDecimal(9800), Specialty.DEVELOPER));
    result.add(new Specialist("Ivan Kotliarevsky", new BigDecimal(9000), Specialty.TESTER));
    result.add(new Specialist("Demyan Bedny", new BigDecimal(12000), Specialty.TESTER));
    result.add(new Specialist("Moyshe-Leyb Halpern", new BigDecimal(17000), Specialty.HR_MANAGER));
    result.add(new Specialist("Eduard Bagritsky", new BigDecimal(11000), Specialty.HR_MANAGER));
    
    return result;
  }
  
  // Search by specialty
  public static List<Specialist> filterBySpecialty(List<Specialist> specialists, Specialty specialty) {
    List<Specialist> result = new ArrayList<>();
    for (int i = 0; i < specialists.size(); i++) {
      if (specialists.get(i).getSpecialty().equals(specialty)) {
        result.add(specialists.get(i));
      }
    }
    return result;
  }
  
  // Match check all developers
  public static boolean matchAllDevelopers(List<Specialist> specialists) {
    for (int i = 0; i < specialists.size(); i++) {
      if (!specialists.get(i).getSpecialty().equals(Specialty.DEVELOPER)) {
        return false;
      }
    }
    return true;
  }
  
  // Checking matches - are there developers
  public static boolean matchAnyDeveloper(List<Specialist> specialists) {
    for (int i = 0; i < specialists.size(); i++) {
      if (specialists.get(i).getSpecialty().equals(Specialty.DEVELOPER)) {
        return true;
      }
    }
    return false;
  }
  
  // Checking for matches - does everyone have a RFP higher than the specified one
  public static boolean matchAllSalaryMoreThen(List<Specialist> specialists, BigDecimal salary) {
    for (int i = 0; i < specialists.size(); i++) {
      if (specialists.get(i).getSalary().compareTo(salary) < 0) {
        return false;
      }
    }
    return true;
  }
  
  // Проверка совпадений - никто не имеет ЗП выше указанной
  public static boolean matchNoneSalaryMoreThen(List<Specialist> specialists, BigDecimal salary) {
    for (int i = 0; i < specialists.size(); i++) {
      if (specialists.get(i).getSalary().compareTo(salary) > 0) {
        return false;
      }
    }
    return true;
  }
  
  // Console output
  public static void printSpecialists(List<Specialist> specialists) {
    System.out.println("OldWayApi -> printSpecialists: ");
    specialists.forEach(System.out::println);
  }
}
