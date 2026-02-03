package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fehs extends evsn implements evui {
    public static final fehs a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        fehs fehsVar = new fehs();
        a = fehsVar;
        evsn.registerDefaultInstance(fehs.class, fehsVar);
    }

    private fehs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", fehq.a, "d"});
        }
        if (iOrdinal == 3) {
            return new fehs();
        }
        if (iOrdinal == 4) {
            return new fehp();
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
        synchronized (fehs.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
