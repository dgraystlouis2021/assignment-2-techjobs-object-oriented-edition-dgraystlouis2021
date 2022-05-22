package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        //Car test_car = new Car("Toyota", "Prius", 10, 50);
        //assertEquals(10, test_car.getGasTankLevel(), .001);
        Job jobA=new Job();
        Job jobB=new Job();
        assertFalse(jobA.getId()==jobB.getId());
        assertTrue(jobB.getId()==jobA.getId()+1);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobA=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobA instanceof Job);
        assertTrue((jobA.getName()).equals("Product tester"));
        assertTrue((jobA.getEmployer().getValue()).equals("ACME"));
        assertTrue((jobA.getLocation().getValue()).equals("Desert"));
        assertTrue((jobA.getPositionType().getValue()).equals("Quality control"));
        assertTrue((jobA.getCoreCompetency().getValue()).equals("Persistence"));
    }
    @Test
    public void testJobsForEquality() {
        Job jobA=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobA.equals(jobB));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //assertTrue(jobA.toString().startsWith("\n"));
        //assertTrue(jobA.toString().endsWith("\n"));
        //String s=jobA.toString();
        //assertTrue(s.charAt(0)=='\n');
        //assertTrue(s.charAt(s.length()-1)=='\n');
        int index = (jobA.toString().length() - 1);

        //assertTrue(jobA.toString().charAt(0) == '\n');
        //assertTrue(jobA.toString().charAt(lastIndex) == '\n');
        assertEquals('\n',jobA.toString().charAt(0));
        assertEquals('\n',jobA.toString().charAt(index));
/*
        String temp = jobA.toString();
        // STORE toString() RESULT IN s ARRAY
        String[] s;
        s = temp.split("\n");
        assertEquals(s.length, 7);

        HashMap<String, Object> stringList = new HashMap<>();
        Object x = (Integer) (jobA.getId());
        stringList.put("ID:", x);
        x = (Object) (jobA.getName());
        stringList.put("Name:", x);
        x = (Object) (jobA.getEmployer());
        stringList.put("Employer:", x);
        x = (Object) (jobA.getLocation());
        stringList.put("Location:", x);
        x = (Object) (jobA.getPositionType());
        stringList.put("Position Type:", x);
        x = (Object) (jobA.getCoreCompetency());
        stringList.put("Core Competency:", x);
        Set<Map.Entry<String, Object>> entrySet = stringList.entrySet();
        for (int i = 0; i < s.length; i++) {
            String stringTemp = s[i];
            //String s=stringTemp.split(" ",1);
            String[] stringArray = stringTemp.split(" ",1);
            for (Map.Entry<String, Object> entry : entrySet) {
                if (entry.getKey().equals(stringArray[0])) {
                    if ((stringArray[1].trim()).equals("Data not available")) {
                        assertEquals(entry.getValue(), null);
                        break;
                    }else{
                        assertEquals(stringArray[1].trim(),entry.getValue().toString());
                    }
                }
            }
        }
 */
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        //Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobA = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String temp = jobA.toString();
        // STORE toString() RESULT IN s ARRAY
        String[] s;
        s = temp.split("\n");
        assertEquals(7,s.length);

        HashMap<String, Object> stringList = new HashMap<>();
        Object x = (Integer) (jobA.getId());
        stringList.put("ID", x);
        x = (Object) (jobA.getName());
        stringList.put("Name", x);
        x = (Object) (jobA.getEmployer());
        stringList.put("Employer", x);
        x = (Object) (jobA.getLocation());
        stringList.put("Location", x);
        x = (Object) (jobA.getPositionType());
        stringList.put("Position Type", x);
        x = (Object) (jobA.getCoreCompetency());
        stringList.put("Core Competency", x);
        Set<Map.Entry<String, Object>> entrySet = stringList.entrySet();
        for (int i = 0; i < s.length; i++) {
            String stringTemp = s[i];
            //String s=stringTemp.split(" ",1);
            // split on 1st instance
            String[] stringArray = stringTemp.split(": ",2);
            for (Map.Entry<String, Object> entry : entrySet) {
                if (entry.getKey().equals(stringArray[0])) {
                    if ((stringArray[1].trim()).equals("Data not available")) {
                        // compares model data to toString output data
                        assertEquals(entry.getValue().toString(),stringArray[1].trim());
                        break;
                    }else{
                        // compares model data to toString output data
                        assertEquals(entry.getValue().toString(),stringArray[1].trim());
                    }
                }
            }
        }
    }
    @Test
    public void testToStringHandlesEmptyField(){
        //Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobA = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String temp = jobA.toString();
        // STORE toString() RESULT IN s ARRAY
        String[] s;
        s = temp.split("\n");
        assertEquals(7,s.length);

        HashMap<String, Object> stringList = new HashMap<>();
        Object x = (Integer) (jobA.getId());
        stringList.put("ID", x);
        x = (Object) (jobA.getName());
        stringList.put("Name", x);
        x = (Object) (jobA.getEmployer());
        stringList.put("Employer", x);
        x = (Object) (jobA.getLocation());
        stringList.put("Location", x);
        x = (Object) (jobA.getPositionType());
        stringList.put("Position Type", x);
        x = (Object) (jobA.getCoreCompetency());
        stringList.put("Core Competency", x);
        Set<Map.Entry<String, Object>> entrySet = stringList.entrySet();
        for (int i = 0; i < s.length; i++) {
            String stringTemp = s[i];
            //String s=stringTemp.split(" ",1);
            // split on 1st instance
            String[] stringArray = stringTemp.split(": ",2);
            for (Map.Entry<String, Object> entry : entrySet) {
                if (entry.getKey().equals(stringArray[0])) {
                    if ((stringArray[1].trim()).equals("Data not available")) {
                        // compares model data to toString output data
                        assertEquals(entry.getValue().toString(),stringArray[1].trim());
                        break;
                    }else{
                        // compares model data to toString output data
                        assertEquals(entry.getValue().toString(),stringArray[1].trim());
                    }
                }
            }
        }
    }
}
