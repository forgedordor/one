package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdc extends evsn implements evui {
    public static final emdc a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        emdc emdcVar = new emdc();
        a = emdcVar;
        evsn.registerDefaultInstance(emdc.class, emdcVar);
    }

    private emdc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", emdb.a});
        }
        if (iOrdinal == 3) {
            return new emdc();
        }
        if (iOrdinal == 4) {
            return new emda();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emdc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
