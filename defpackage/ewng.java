package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewng extends evsn implements evui {
    public static final ewng a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int e;
    public ewmz f;
    public int h;
    public int i;
    public int j;
    public String d = "";
    public String g = "";

    static {
        ewng ewngVar = new ewng();
        a = ewngVar;
        evsn.registerDefaultInstance(ewng.class, ewngVar);
    }

    private ewng() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = ewne.a;
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0006ဉ\u0005\u0007ဈ\u0006\b᠌\u0007\tင\b\nင\t", new Object[]{"b", "c", ewnc.a, "d", "e", evsvVar, "f", "g", "h", evsvVar, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ewng();
        }
        if (iOrdinal == 4) {
            return new ewmx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewng.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
