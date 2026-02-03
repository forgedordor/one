package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fena {
    public static final fena a = new fena();

    private fena() {
    }

    public static final femz a(String str) {
        ferc fercVar = new ferc();
        if ("VALARM".equals(str)) {
            return new ferw(fercVar);
        }
        if ("VEVENT".equals(str)) {
            return new fesg(fercVar);
        }
        if ("VFREEBUSY".equals(str)) {
            return new fesk(fercVar);
        }
        if ("VJOURNAL".equals(str)) {
            return new feso(fercVar);
        }
        if ("VTODO".equals(str)) {
            return new fesy(fercVar);
        }
        if ("STANDARD".equals(str)) {
            return new ferr(fercVar);
        }
        if ("DAYLIGHT".equals(str)) {
            return new ferp(fercVar);
        }
        if ("VTIMEZONE".equals(str)) {
            return new fesp(fercVar);
        }
        if ("VVENUE".equals(str)) {
            return new fesz(fercVar);
        }
        if ("VAVAILABILITY".equals(str)) {
            return new ferx(fercVar);
        }
        if ("AVAILABLE".equals(str)) {
            return new fern(fercVar);
        }
        if (str.startsWith("X-") && str.length() > 2) {
            return new feta(str, fercVar);
        }
        if (fewr.b("ical4j.parsing.relaxed")) {
            return new feta(str, fercVar);
        }
        throw new IllegalArgumentException(a.a(str, "Illegal component [", "]"));
    }
}
