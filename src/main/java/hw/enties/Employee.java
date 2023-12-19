package hw.enties;

import hw.fabrics.IdGenerator;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
public class Employee {
    private final long ID;
    private PhoneNumber phoneNumber;
    private String name;
    @Getter(AccessLevel.NONE)
    private Date dateOfWorkingStart;

    public Employee(PhoneNumber phoneNumber, String name, Date dateOfWorkingStart) {
        ID = IdGenerator.getCurrentAvailableID();
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.dateOfWorkingStart = dateOfWorkingStart;
    }

    public long getYearsOfSeniority() {
        Date todayDate = new Date();
        return TimeUnit.DAYS.convert(Math.abs(todayDate.getTime() - dateOfWorkingStart.getTime()), TimeUnit.MILLISECONDS) / 365;
    }

    @Override
    public String toString() {
        return "Employee { id: " + ID +  "; phoneNumber : " + phoneNumber  + "; name : " + name +
                "; yearsOfSeniority: " + getYearsOfSeniority() + " }";
    }
}
