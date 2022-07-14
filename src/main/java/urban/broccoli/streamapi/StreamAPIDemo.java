package urban.broccoli.streamapi;

import urban.broccoli.streamapi.model.Specialist;
import urban.broccoli.streamapi.model.Specialty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class StreamAPIDemo {
  
  public static void main(String[] args) {
    List<Specialist> specialistsOld = OldWayUtil.getSpecialists();
    List<Specialist> specialists = StreamAPIUtil.getSpecialists();
    
    // Filter
    List<Specialist> developersOld = OldWayUtil.filterBySpecialty(specialistsOld, Specialty.DEVELOPER);
    List<Specialist> developers = StreamAPIUtil.filterBySpecialty(specialists, Specialty.DEVELOPER);
    StreamAPIUtil.printSpecialists(developersOld);
    StreamAPIUtil.printSpecialists(developers);
    
    // Sorting
    List<Specialist> sortedSpecialistsAsc = StreamAPIUtil.sortSpecialistsByNameAsc(specialists);
    List<Specialist> sortedSpecialistsDesc = StreamAPIUtil.sortSpecialistsByNameDesc(specialists);
    StreamAPIUtil.printSpecialists(sortedSpecialistsAsc);
    StreamAPIUtil.printSpecialists(sortedSpecialistsDesc);
    
    // Max salary
    Specialist withMaxSalary = StreamAPIUtil.findWithMaxSalary(specialists);
    System.out.println("StreamAPIUtil -> findWithMaxSalary: " + withMaxSalary);
    // Min salary
    Specialist withMinSalary = StreamAPIUtil.findWithMinSalary(specialists);
    System.out.println("StreamAPIUtil -> findWithMinSalary: " + withMinSalary);
    
    // Grouping
    Map<Specialty, List<Specialist>> groupedBySpecialty = StreamAPIUtil.groupBySpecialty(specialists);
    System.out.println("StreamAPIUtil -> groupBySpecialty: " + groupedBySpecialty);
    
    // All developers
    boolean allEngineersOld = OldWayUtil.matchAllDevelopers(specialistsOld);
    boolean allEngineers = StreamAPIUtil.matchAllDevelopers(specialists);
    System.out.println("OldWayUtil -> matchAllDevelopers: " + allEngineersOld);
    System.out.println("StreamAPIUtil -> matchAllDevelopers: " + allEngineers);
    
    // Any developers
    boolean anyEngineerOld = OldWayUtil.matchAnyDeveloper(specialistsOld);
    boolean anyEngineer = StreamAPIUtil.matchAnyDeveloper(specialists);
    System.out.println("OldWayUtil -> matchAnyDeveloper: " + anyEngineerOld);
    System.out.println("StreamAPIUtil -> matchAnyDeveloper: " + anyEngineer);
    
    // All salary more then
    boolean allSalaryMoreThenOld = OldWayUtil.matchAllSalaryMoreThen(specialistsOld, new BigDecimal(10000));
    boolean allSalaryMoreThen = StreamAPIUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(10000));
    System.out.println("OldWayUtil -> matchAllSalaryMoreThen: " + allSalaryMoreThenOld);
    System.out.println("StreamAPIUtil -> matchAllSalaryMoreThen: " + allSalaryMoreThen);
    
    // No one with salary more then
    boolean noOneWithSalaryMoreThenOld = OldWayUtil.matchNoneSalaryMoreThen(specialistsOld, new BigDecimal(10000));
    boolean noOneWithSalaryMoreThen = StreamAPIUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
    System.out.println("OldWayUtil -> matchNoneSalaryMoreThen: " + noOneWithSalaryMoreThenOld);
    System.out.println("StreamAPIUtil -> matchNoneSalaryMoreThen: " + noOneWithSalaryMoreThen);
  }
}
