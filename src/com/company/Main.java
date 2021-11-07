package com.company;

public class Main {
    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.planet = 2;
        andromeda.moon = 4;
        andromeda.Sun = 1;

        FeatureSun NailyaSun = new FeatureSun();
        NailyaSun.color = "ShinnyGold";
        NailyaSun.heat = "1234567890";
        NailyaSun.temp = "36000C";
        NailyaSun.radius = "987654321km";

        Planet2 astranout = new Planet2();
        astranout.color = "Silver";
        astranout.size = "19282736456";
        astranout.status = "Shinning";

        Planet1 NailyaAstranout = new Planet1();
        NailyaAstranout.color = "WonderfullGold";
        NailyaAstranout.size = 1234567890;


    }
}
