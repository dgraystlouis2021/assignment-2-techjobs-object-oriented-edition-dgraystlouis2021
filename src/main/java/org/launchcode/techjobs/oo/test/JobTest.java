package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        Job jobA=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobA.toString().startsWith("\n"));
    }
}
