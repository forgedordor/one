package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;

/* loaded from: classes9.dex */
public interface Chronology extends Comparable<Chronology> {

    /* renamed from: j$.time.chrono.Chronology$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Chronology a(TemporalAccessor temporalAccessor) {
            Objects.a(temporalAccessor, "temporal");
            return (Chronology) Objects.requireNonNullElse((Chronology) temporalAccessor.I(j$.time.temporal.k.b), q.d);
        }

        public static Chronology b(String str) {
            ConcurrentHashMap concurrentHashMap = AbstractC0019a.a;
            Objects.a(str, "id");
            do {
                Chronology chronology = (Chronology) AbstractC0019a.a.get(str);
                if (chronology == null) {
                    chronology = (Chronology) AbstractC0019a.b.get(str);
                }
                if (chronology != null) {
                    return chronology;
                }
            } while (AbstractC0019a.o());
            Iterator it = ServiceLoader.load(Chronology.class).iterator();
            while (it.hasNext()) {
                Chronology chronology2 = (Chronology) it.next();
                if (str.equals(chronology2.getId()) || str.equals(chronology2.getCalendarType())) {
                    return chronology2;
                }
            }
            throw new DateTimeException("Unknown chronology: ".concat(str));
        }

        public static Chronology ofLocale(Locale locale) {
            ConcurrentHashMap concurrentHashMap = AbstractC0019a.a;
            Objects.a(locale, "locale");
            String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
            if (unicodeLocaleType == null) {
                unicodeLocaleType = locale.equals(AbstractC0019a.c) ? "japanese" : null;
            }
            if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
                return q.d;
            }
            do {
                Chronology chronology = (Chronology) AbstractC0019a.b.get(unicodeLocaleType);
                if (chronology != null) {
                    return chronology;
                }
            } while (AbstractC0019a.o());
            Iterator it = ServiceLoader.load(Chronology.class).iterator();
            while (it.hasNext()) {
                Chronology chronology2 = (Chronology) it.next();
                if (unicodeLocaleType.equals(chronology2.getCalendarType())) {
                    return chronology2;
                }
            }
            throw new DateTimeException("Unknown calendar system: ".concat(unicodeLocaleType));
        }
    }

    ChronoLocalDateTime C(TemporalAccessor temporalAccessor);

    ChronoLocalDate G(Map map, j$.time.format.C c);

    InterfaceC0026h H(Instant instant, ZoneId zoneId);

    ChronoLocalDate date(int i, int i2, int i3);

    ChronoLocalDate dateEpochDay(long j);

    ChronoLocalDate dateYearDay(int i, int i2);

    boolean equals(Object obj);

    k eraOf(int i);

    List eras();

    String getCalendarType();

    String getId();

    int hashCode();

    boolean isLeapYear(long j);

    InterfaceC0026h k(TemporalAccessor temporalAccessor);

    j$.time.temporal.m q(ChronoField chronoField);

    /* renamed from: s */
    int compareTo(Chronology chronology);

    String toString();

    int u(k kVar, int i);

    ChronoLocalDate z(TemporalAccessor temporalAccessor);
}
