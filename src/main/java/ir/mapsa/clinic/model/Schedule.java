
package ir.mapsa.clinic.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "sche_id")
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Temporal(TemporalType.TIME)
    private Date startDate;

    @Temporal(TemporalType.TIME)
    private Date endDate;

    @ManyToOne
    @JoinColumn(name="sch_app_id")
    public Appointment appointment;

    @OneToOne
    @JoinColumn(name="sch_emp_id")
    private Employee employee;

    public Schedule() {
    }

    public Schedule(Date date, Date startDate, Date endDate,Employee employee) {
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee=employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
