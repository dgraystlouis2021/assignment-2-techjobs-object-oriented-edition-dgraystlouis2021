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
    public void testJobToString() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobA.toString().startsWith("\n"));
        assertTrue(jobA.toString().endsWith("\n"));

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
    }

}
