package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enmu extends evsn implements evui {
    public static final enmu a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        enmu enmuVar = new enmu();
        a = enmuVar;
        evsn.registerDefaultInstance(enmu.class, enmuVar);
    }

    private enmu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new enmu();
        }
        if (iOrdinal == 4) {
            return new enmt();
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
        synchronized (enmu.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
