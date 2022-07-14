package urban.broccoli.streamapi;

import lombok.extern.slf4j.Slf4j;
import urban.broccoli.streamapi.model.Specialist;
import urban.broccoli.streamapi.model.Specialty;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class StreamAPIUtil {
  
  public static List<Specialist> getSpecialists() {
    return List.of(
        new Specialist("Ivan Franko", new BigDecimal(15000), Specialty.DEVELOPER),
        new Specialist("Lesya Ukrainka", new BigDecimal(9800), Specialty.DEVELOPER),
        new Specialist("Ivan Kotliarevsky", new BigDecimal(9000), Specialty.TESTER),
        new Specialist("Demyan Bedny", new BigDecimal(12000), Specialty.TESTER),
        new Specialist("Moyshe-Leyb Halpern", new BigDecimal(17000), Specialty.HR_MANAGER),
        new Specialist("Eduard Bagritsky", new BigDecimal(11000), Specialty.HR_MANAGER)
    );
  }
  
  // Console output
  public static void printSpecialists(List<Specialist> specialists) {
    System.out.println("StreamAPIUtil -> printSpecialists: ");
    specialists.forEach(System.out::println);
  }
  
  // Search for a developer with the maximum salary
  public static Specialist findWithMaxSalary(List<Specialist> specialists) {
    return specialists.stream().max(Comparator.comparing(Specialist::getSalary)).orElse(null);
  }
  
  // Search for a developer with a minimum salary
  public static Specialist findWithMinSalary(List<Specialist> specialists) {
    return specialists.stream().min(Comparator.comparing(Specialist::getSalary)).orElse(null);
  }
  
  // Grouping by specialty specialists
  public static Map<Specialty, List<Specialist>> groupBySpecialty(List<Specialist> specialists) {
    return specialists.stream().collect(Collectors.groupingBy(Specialist::getSpecialty));
  }
  
  // Search by specialty
  public static List<Specialist> filterBySpecialty(List<Specialist> specialists, Specialty specialty) {
    return specialists.stream()
        .filter(specialist -> specialist.getSpecialty().equals(specialty))
        .collect(Collectors.toList());
  }
  
  // Sort by name ascending
  public static List<Specialist> sortSpecialistsByNameAsc(List<Specialist> specialists) {
    return specialists.stream()
        .sorted(Comparator.comparing(Specialist::getName))
        .collect(Collectors.toList());
  }
  
  // Sort by name descending
  public static List<Specialist> sortSpecialistsByNameDesc(List<Specialist> specialists) {
    return specialists.stream()
        .sorted(Comparator.comparing(Specialist::getName).reversed())
        .collect(Collectors.toList());
  }
  
  // Match check all developers
  public static boolean matchAllDevelopers(List<Specialist> specialists) {
    return specialists.stream().allMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVELOPER));
  }
  
  // Checking matches - are there developers
  public static boolean matchAnyDeveloper(List<Specialist> specialists) {
    return specialists.stream().anyMatch(specialist -> specialist.getSpecialty().equals(Specialty.DEVELOPER));
  }
  
  // Checking for matches - does everyone have a RFP higher than the specified one
  public static boolean matchAllSalaryMoreThen(List<Specialist> specialists, BigDecimal salary) {
    return specialists.stream().allMatch(specialist -> specialist.getSalary().compareTo(salary) > 0);
  }
  
  // Match check - no one has a RFP higher than the specified one
  public static boolean matchNoneSalaryMoreThen(List<Specialist> specialists, BigDecimal salary) {
    return specialists.stream().noneMatch(specialist -> specialist.getSalary().compareTo(salary) > 0);
  }
}
