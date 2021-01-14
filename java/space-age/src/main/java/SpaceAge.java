class SpaceAge {
    private final double age;
    private final double EARTH_SECONDS = 31557600;
    private final double MERCURY_SECONDS = EARTH_SECONDS * 0.2408467;
    private final double VENUS_SECONDS = EARTH_SECONDS * 0.61519726;
    private final double MARS_SECONDS = EARTH_SECONDS * 1.8808158;
    private final double JUPITER_SECONDS = EARTH_SECONDS * 11.862615;
    private final double SATURN_SECONDS = EARTH_SECONDS * 29.447498;
    private final double URANUS_SECONDS = EARTH_SECONDS * 84.016846;
    private final double NEPTUNE_SECONDS = EARTH_SECONDS * 164.7913;

    SpaceAge(double seconds) {
        this.age = seconds;
    }

    double getSeconds() {
        return age;
    }


    double onEarth() {
        return getSeconds() / EARTH_SECONDS;
    }

    double onMercury() {
        return getSeconds() / MERCURY_SECONDS;
    }

    double onVenus() {
        return getSeconds() / VENUS_SECONDS;
    }

    double onMars() {
        return getSeconds() / MARS_SECONDS;
    }

    double onJupiter() {
        return getSeconds() / JUPITER_SECONDS;
    }

    double onSaturn() {
        return getSeconds() / SATURN_SECONDS;
    }

    double onUranus() {
        return getSeconds() / URANUS_SECONDS;
    }

    double onNeptune() {
        return getSeconds() / NEPTUNE_SECONDS;
    }

}
