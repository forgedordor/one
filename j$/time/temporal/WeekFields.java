package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class WeekFields implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final f h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final DayOfWeek a;
    public final int b;
    public final transient n c;
    public final transient n d;
    public final transient n e;
    public final transient n f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        h = g.d;
    }

    public WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.c = new n("DayOfWeek", this, chronoUnit, chronoUnit2, n.f);
        this.d = new n("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, n.g);
        f fVar = g.d;
        this.e = new n("WeekOfWeekBasedYear", this, chronoUnit2, fVar, n.i);
        this.f = new n("WeekBasedYear", this, fVar, ChronoUnit.FOREVER, ChronoField.YEAR.d);
        Objects.a(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WeekFields a(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentHashMap.get(str);
    }

    public static WeekFields of(Locale locale) {
        Objects.a(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        return a(DayOfWeek.a[((((int) ((firstDayOfWeek - 1) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.a) + "," + this.b + "]";
    }
}
