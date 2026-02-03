package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgjp extends evsn implements evui {
    public static final cgjp a;
    private static volatile evuo e;
    public int b;
    public int c;
    public String d = "";

    static {
        cgjp cgjpVar = new cgjp();
        a = cgjpVar;
        evsn.registerDefaultInstance(cgjp.class, cgjpVar);
    }

    private cgjp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", cgle.a, "d"});
        }
        if (iOrdinal == 3) {
            return new cgjp();
        }
        if (iOrdinal == 4) {
            return new cgjo();
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
        synchronized (cgjp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
