package com.tp.neo.model;

import com.tp.neo.model.Project;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-19T10:54:10")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-16T21:32:37")
>>>>>>> neoforce/master
@StaticMetamodel(ProjectUnit.class)
public class ProjectUnit_ { 

    public static volatile SingularAttribute<ProjectUnit, Integer> quantity;
    public static volatile SingularAttribute<ProjectUnit, Integer> maxPaymentDuration;
    public static volatile SingularAttribute<ProjectUnit, Double> amountPayable;
    public static volatile SingularAttribute<ProjectUnit, Double> cpu;
    public static volatile SingularAttribute<ProjectUnit, Double> leastInitDep;
    public static volatile SingularAttribute<ProjectUnit, Double> discount;
    public static volatile SingularAttribute<ProjectUnit, Project> project;
    public static volatile SingularAttribute<ProjectUnit, String> title;
    public static volatile SingularAttribute<ProjectUnit, Double> commissionPercentage;
    public static volatile SingularAttribute<ProjectUnit, Short> deleted;
    public static volatile SingularAttribute<ProjectUnit, Date> createdDate;
    public static volatile SingularAttribute<ProjectUnit, Long> createdBy;
    public static volatile SingularAttribute<ProjectUnit, Date> modifiedDate;
    public static volatile SingularAttribute<ProjectUnit, Long> modifiedBy;
    public static volatile SingularAttribute<ProjectUnit, Long> id;
    public static volatile SingularAttribute<ProjectUnit, Double> monthlyPay;

}