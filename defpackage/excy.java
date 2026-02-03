package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class excy extends evsn implements evui {
    public static final excy a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        excy excyVar = new excy();
        a = excyVar;
        evsn.registerDefaultInstance(excy.class, excyVar);
    }

    private excy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new excy();
        }
        if (iOrdinal == 4) {
            return new excx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (excy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
