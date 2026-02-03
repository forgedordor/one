package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exum extends evsn implements evui {
    public static final exum a;
    private static volatile evuo e;
    public int b;
    public int c = 1;
    public String d = "";

    static {
        exum exumVar = new exum();
        a = exumVar;
        evsn.registerDefaultInstance(exum.class, exumVar);
    }

    private exum() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", exuj.a, "d"});
        }
        if (iOrdinal == 3) {
            return new exum();
        }
        if (iOrdinal == 4) {
            return new exul();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exum.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
