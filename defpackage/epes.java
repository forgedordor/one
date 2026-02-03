package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epes extends evsn implements evui {
    public static final epes a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        epes epesVar = new epes();
        a = epesVar;
        evsn.registerDefaultInstance(epes.class, epesVar);
    }

    private epes() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new epes();
        }
        if (iOrdinal == 4) {
            return new epeq();
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
        synchronized (epes.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
