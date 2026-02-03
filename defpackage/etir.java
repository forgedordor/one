package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etir extends evsn implements evui {
    public static final etir a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        etir etirVar = new etir();
        a = etirVar;
        evsn.registerDefaultInstance(etir.class, etirVar);
    }

    private etir() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", etgc.a, "d", etga.a});
        }
        if (iOrdinal == 3) {
            return new etir();
        }
        if (iOrdinal == 4) {
            return new etiq();
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
        synchronized (etir.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
