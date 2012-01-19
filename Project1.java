/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.*;

public class Project1 {

    public static void main(String[] args) {
        ArrayList<waypoint> wplist = new ArrayList<waypoint>();

        waypoint wp1 = new waypoint("Matara Bodiya", 0.0, 0.0);
        waypoint wp2 = new waypoint("Walpala Junction ", 1.0, 2.0);
        waypoint wp3 = new waypoint("Rajamaha Wiharaya", 3.6, 5.6);
        waypoint wp4 = new waypoint("Bus Stand", 8.3, 5.6);
        waypoint wp5 = new waypoint("Nupe junction", 11.2, 0.0);
        waypoint wp6 = new waypoint("GabadaVeediya Junction", 0.0, -2.3);
        waypoint wp7 = new waypoint("wp7", 2.3, 2.6);
        /*wplist.add(wp1);
        wplist.add(wp2);
        wplist.add(wp3);
        wplist.add(wp4);
        wplist.add(wp5);
        wplist.add(wp6);
        wplist.add(wp7);
        wplist.get(0);*/
        //...............Create Roads....................//
        road rd2 = new road("Sri Darmarama Mawatha", "C12", wp1, wp3);
        road rd1 = new road("Galle Raod", "A2", wp5, wp4);
        road rd4 = new road("Hakmana Raod", "B12", wp1, wp6);

        //..................Create BuildEnvironment................//
        house h1 = new house("House  ", wp1, "No 55,Weragampira,Matara ", "Newly built");
        religous rp1 = new religous("Temple ", wp2, "No62,Weragampita RajaMahawiharaya,Matara ", "Very old temple");
        privateBusiness pb1 = new privateBusiness("Private Business  ", wp3, " No 56.Galle Raod,Colombo", " A resturent");
        PInfrastructure pi1 = new PInfrastructure("Public Infrastructure  ", wp5, "No 56/6,Colombo  ", "DA Office");
        //.....................Create Naturals..................//
        parks pk1 = new parks("Children's Park   ", wp7, "No 141,Matara", 0.21f);
        waterWays ww1 = new waterWays("River ..", wp1, wp7);

        //...............Print the Info...............................//
        System.out.println("\n..............................Road NetWork...............................\n" + rd1.show() + "\n" + rd2.show() + "\n" + rd4.show());
        System.out.println("\n.............................Build Environment............................. \n" + h1.show());
        System.out.println("\n" + rp1.show());
        System.out.println("\n" + pb1.show());
        System.out.println("\n" + pi1.show());
        System.out.println("\n..............Natural Environment....................\n" + pk1.show());
        System.out.println("\n" + ww1.show());


    }
}
////////////////////////////////////////////////////////////
class waypoint {

    private String name;
    private double xCordinate;
    private double yCordinate;

    waypoint(String name, double x, double y) {
        this.name = name;
        xCordinate = x;
        yCordinate = y;
    }

    public double getxCordinate() {
        return xCordinate;
    }

    public double getyCordinate() {
        return yCordinate;
    }

    public String getname() {
        return name;
    }
}
///////////////////////////////////////

class road {

    private String name;
    private String identifire;
    private waypoint start;
    private waypoint end;

    road(String name, String Id, waypoint start, waypoint end) {
        this.name = name;
        identifire = Id;
        this.start = start;
        this.end = end;
    }

    public String show() {
        return name + "  " + identifire + " Start x-Cor: " + start.getxCordinate() + " Start y-Cor: " + start.getyCordinate() + " End x-Cor: " + end.getxCordinate() + " End y-Cor: " + end.getyCordinate();
    }
}

/////////////////////////////
class RoadNetwork {

    private int noOfRoads;

    //////////////TO set & get NO of Roads///////////////////
    private void setnoOfRoads() {
        noOfRoads = 4;
    }

    private int getnofRoads() {
        return noOfRoads;
    }

    public void show() {
    }
    /*public void show(){
    System.out.println(""+rd1);
    }
    /*public void setRoad(){
    S
    
    /*road rd1=new road("Galle Raod", "A2",wplist.sds(wp1),wplist.sds(wp2));
    road rd2=new road("Sri Darmarama Mawatha", "C12", wp1, wp3);
    road rd3=new road("Hakmana Raod","B12",wp1,wp6);
    }*/
}

class buildEnvironment {

    String type;
    waypoint location;

    waypoint getLocation() {
        return location;
    }
}

abstract class property {

    String address;
    String type;
    waypoint location;
    /*void property(String type,waypoint location,String address){
    this.type=type;
    this.location=location;
    this.address=address;*/
}

class house extends property {

    private String Discription;

    house(String type, waypoint location, String address, String Discription) {
        super.address = address;
        super.type = type;
        super.location = location;
        this.Discription = Discription;
    }

    String show() {
        return "Typr:" + type + "Address:" + address + "Nearest WayPoint X-Cor" + location.getxCordinate() + "Y-Cor " + location.getyCordinate() + "Discription" + Discription;
    }
}

class religous extends property {

    String religion;

    religous(String type, waypoint location, String address, String religion) {
        super.address = address;
        super.type = type;
        super.location = location;
        this.religion = religion;
    }

    String show() {
        return "Type:" + type + "Address:" + address + "Nearest WayPoint X-Cor" + location.getxCordinate() + "Y-Cor " + location.getyCordinate() + "Religion" + religion;
    }
}

class privateBusiness extends property {

    String BDiscription;

    privateBusiness(String type, waypoint location, String address, String BD) {
        super.address = address;
        super.type = type;
        super.location = location;
        this.BDiscription = BD;
    }

    String show() {
        return "Type:" + type + "Address:" + address + "Nearest WayPoint X-Cor" + location.getxCordinate() + "Y-Cor " + location.getyCordinate() + "Business Discription" + BDiscription;
    }
}

class PInfrastructure extends property {

    String PIDiscription;

    PInfrastructure(String type, waypoint location, String address, String PID) {
        super.address = address;
        super.type = type;
        super.location = location;
        this.PIDiscription = PID;
    }

    String show() {
        return "Type:" + type + "Address:" + address + "Nearest WayPoint X-Cor" + location.getxCordinate() + "Y-Cor  " + location.getyCordinate() + "PI Discription" + PIDiscription;
    }
}

class NaturalEnvironment {

    String typeOfPalce;
    waypoint location;

    waypoint getLocation() {
        return location;
    }
}

abstract class NaturalResource {

    String address;
    String type;
    waypoint location;
}

class parks extends NaturalResource {

    private float size;

    parks(String type, waypoint location, String address, float size) {
        super.address = address;
        super.type = type;
        super.location = location;
        this.size = size;
    }

    String show() {
        return "Type:" + type + "Address:" + address + "Nearest WayPoint X-Cor :" + location.getxCordinate() + "Y-Cor:  " + location.getyCordinate() + "Size Of the Park" + size + "km^2";
    }
}

class waterWays extends NaturalResource {

    private waypoint start;
    private waypoint end;

    waterWays(String type, waypoint wwstart, waypoint wwend) {
        super.type = type;
        this.start = wwstart;
        this.end = wwend;

    }

    String show() {
        return "Type:" + type + "Start WayPoint X-Cor :" + start.getxCordinate() + "  Y-Cor:  " + start.getyCordinate() + "  End Wapoint: X-Cor:  " + end.getxCordinate() + "  Y Cor:" + end.getyCordinate();
    }
}