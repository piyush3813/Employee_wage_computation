package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class EmployeeWageComputation {
    static Logger logger = Logger.getLogger(EmployeeWageComputation.class);
    public static void main(String[] args){
        BasicConfigurator.configure();
        logger.info("Welcome To Employee Wage Computation ");

        final int FULL_TIME = 1;
        final int WAGE_PER_HRS = 20;
        int working_hrs = 0;
        int emp_typ=(int) ((Math.random()*100)%2);
        if (emp_typ==FULL_TIME){
            logger.info("the employee is Present");
            working_hrs=8;
        }
        else{
            logger.info("the employee is Absent");
        }
        int wage = working_hrs * WAGE_PER_HRS;
        logger.info("employee wage per day is - "+wage);
    }
}
