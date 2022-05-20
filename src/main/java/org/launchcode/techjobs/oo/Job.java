package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    public Job(Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    public Job(String name, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String msg="Data not available";
        String s="";
        s+="\nID: "+id+"\n";
        name=name.equals("")?msg:name;
        s+="Name: "+name+"\n";
        employer=employer.getValue().equals("")?new Employer(msg):employer;
        s+="Employer: "+employer+"\n";
        location=location.getValue().equals("")?new Location(msg):location;
        s+="Location: "+location+"\n";
        positionType=positionType.getValue().equals("")?new PositionType(msg):positionType;
        s+="Position Type: "+positionType+"\n";
        coreCompetency=coreCompetency.getValue().equals("")?new CoreCompetency(msg):coreCompetency;
        s+="Core Competency: "+coreCompetency+"\n";
        return s;
    }
/*
    @Override
    public String toString() {
        String msg="Data not available";
        String s="";
        s+="\nID: "+id+"\n";
        s+="Name: "+name+"\n";
        s+="Employer: "+employer+"\n";
        s+="Location: "+location+"\n";
        s+="Position Type: "+positionType+"\n";
        s+="Core Competency: "+coreCompetency+"\n";
        return s;
    }
*/
    public boolean checkIfStringNull(String s){
        if(s.equals(null)){
            return true;
        }
        return false;
    }

    public <T> boolean checkIfObjectValueNull(T obj){
        Object o;
        o=obj;
        try {
            Field f=obj.getClass().getDeclaredField("value");
            String s=f.toString();
            if (obj.getClass().getDeclaredField("value").equals("")) {
                return true;
            }
        }catch(NoSuchFieldException ex){

        }
        return false;
    }
}
