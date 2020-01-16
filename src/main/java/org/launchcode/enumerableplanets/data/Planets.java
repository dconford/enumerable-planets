package org.launchcode.enumerableplanets.data;

public enum Planets {
    // list the planets here.
    MERCURY("Mercury", "88", "12.1", "0.2408467"),
    VENUS("Venus", "225", "29.1", "0.61519726"),
    EARTH("Earth", "365", "32.041", "1.0000174"),
    MARS("Mars", "687", "12.2", "1.8808476"),
    JUPITER("Jupiter", "4333", "81.3", "11.862615"),
    SATURN("Saturn", "10759", "34.3", "29.447498"),
    URANUS("Uranus", "30687", "29.1", "84.016846"),
    NEPTUNE("Neptune", "60200", "36.6", "\t164.79132");

    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list

    private final String planetName;
    private final String yearLength;
    private final String surfaceGravity;
    private final String orbitalPeriod;

    Planets(String planetName, String yearLength, String surfaceGravity, String orbitalPeriod) {
        this.planetName = planetName;
        this.yearLength = yearLength;
        this.surfaceGravity = surfaceGravity;
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getYearLength() {
        return yearLength;
    }

    public String getSurfaceGravity() {
        return surfaceGravity;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }
}
