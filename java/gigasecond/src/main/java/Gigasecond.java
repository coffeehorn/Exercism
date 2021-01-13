import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.ZoneOffset.UTC;

public class Gigasecond {
    private LocalDateTime ldt = null;
    private long giga = (long)Math.pow(10, 9);

    public Gigasecond(LocalDate moment) {
        this.ldt = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.ldt = moment;
    }

    public LocalDateTime getDateTime() {
        return ldt.plusSeconds(giga);
    }
}
