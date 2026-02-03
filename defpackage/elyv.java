package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elyv extends evsn implements evui {
    public static final elyv a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        elyv elyvVar = new elyv();
        a = elyvVar;
        evsn.registerDefaultInstance(elyv.class, elyvVar);
    }

    private elyv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elyp.a;
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", evsvVar, "d", elyr.a, "e", elyt.a, "f", evsvVar});
        }
        if (iOrdinal == 3) {
            return new elyv();
        }
        if (iOrdinal == 4) {
            return new elyo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elyv.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
