package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feri {
    public static feri a;

    static {
        try {
            a = (feri) Class.forName(fews.a("net.fortuna.ical4j.timezone.registry")).newInstance();
        } catch (Exception unused) {
            a = new feni();
        }
    }

    public abstract ferh a();
}
