package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbc extends evsn implements evui {
    public static final cvbc a;
    private static volatile evuo e;
    public int b;
    public int c = 1;
    public int d = 1;

    static {
        cvbc cvbcVar = new cvbc();
        a = cvbcVar;
        evsn.registerDefaultInstance(cvbc.class, cvbcVar);
    }

    private cvbc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = cvba.a;
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", evsvVar, "d", evsvVar});
        }
        if (iOrdinal == 3) {
            return new cvbc();
        }
        if (iOrdinal == 4) {
            return new cvaz();
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
        synchronized (cvbc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
