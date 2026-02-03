package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhb extends evsn implements evui {
    public static final emhb a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        emhb emhbVar = new emhb();
        a = emhbVar;
        evsn.registerDefaultInstance(emhb.class, emhbVar);
    }

    private emhb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", emha.a, "d", elsv.a});
        }
        if (iOrdinal == 3) {
            return new emhb();
        }
        if (iOrdinal == 4) {
            return new emgz();
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
        synchronized (emhb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
