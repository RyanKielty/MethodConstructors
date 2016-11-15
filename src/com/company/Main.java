package com.company;

public class Main {

    public static void main(String[] args) {
        House h = new House();
        h.setStreetnumber(1840);
        h.setStreetname("Taconite");
        h.setStreettype("Trail");
        h.setGarage(true);
        h.setGaragestall(2);
        h.setColor("Tan");
        System.out.println(h.getStreetnumber());
        System.out.println(h.getStreetname());
        System.out.println(h.getStreettype());
        System.out.println(h.hasGarage());
        System.out.println(h.getGaragestall());
        System.out.println(h.getColor());

        Car c = new Car();
        c.setYear(2004);
        c.setColor("Blk");
        c.setMake("Honda");
        c.setModel("Pilot");
        c.setMileage(259000);
        c.setUsed(true);
        c.setGasoline(true);
        System.out.println(c.getYear());
        System.out.println(c.getColor());
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getMileage());
        System.out.println(c.isUsed());
        System.out.println(c.usesGasoline());

        Person p = new Person();
        p.setName("Ryan");
        p.setAge(29);
        p.setHeight(6);
        p.setHair("Brown");
        p.setBald(false);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());
        System.out.println(p.getHair());
        System.out.println(p.isBald());

        Team t = new Team();
        t.setCoaches(3);
        t.setPlayers(15);
        t.setTeamname("Mastodons");
        t.setTeamcolor("Brown");
        t.setSeasonchamps(false);
        t.setPlayoffchamps(true);
        System.out.println(t.getCoaches());
        System.out.println(t.getPlayers());
        System.out.println(t.getTeamname());
        System.out.println(t.getTeamcolor());
        System.out.println(t.isSeasonchamps());
        System.out.println(t.isPlayoffchamps());

        Railcar r = new Railcar();
        r.setCars(10);
        r.setCompanyname("Amtrak");
        r.setPassengers(true);
        r.setElectric(true);
        System.out.println(r.getCars());
        System.out.println(r.getCompanyname());
        System.out.println(r.hasPassengers());
        System.out.println(r.isElectric());
    }
}
