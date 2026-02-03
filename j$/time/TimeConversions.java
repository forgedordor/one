package j$.time;

/* loaded from: classes9.dex */
public class TimeConversions {
    public static java.time.ZonedDateTime convert(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            return null;
        }
        int year = zonedDateTime.getYear();
        int monthValue = zonedDateTime.getMonthValue();
        int dayOfMonth = zonedDateTime.getDayOfMonth();
        int hour = zonedDateTime.getHour();
        int minute = zonedDateTime.getMinute();
        LocalTime localTime = zonedDateTime.a.b;
        byte b = localTime.c;
        int i = localTime.d;
        ZoneId zone = zonedDateTime.getZone();
        return java.time.ZonedDateTime.of(year, monthValue, dayOfMonth, hour, minute, b, i, zone != null ? java.time.ZoneId.of(zone.getId()) : null);
    }

    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return java.time.Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.getSeconds(), duration.getNano());
    }
}
