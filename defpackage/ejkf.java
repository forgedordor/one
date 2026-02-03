package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkf extends evsn implements evui {
    public static final ejkf a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        ejkf ejkfVar = new ejkf();
        a = ejkfVar;
        evsn.registerDefaultInstance(ejkf.class, ejkfVar);
    }

    private ejkf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ejkf();
        }
        if (iOrdinal == 4) {
            return new ejke();
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
        synchronized (ejkf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
