package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtr {
    public static final eqtr a = new eqtr("SHA1");
    public static final eqtr b = new eqtr("SHA224");
    public static final eqtr c = new eqtr("SHA256");
    public static final eqtr d = new eqtr("SHA384");
    public static final eqtr e = new eqtr("SHA512");
    private final String f;

    private eqtr(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
