package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjs extends evsn implements evui {
    public static final eqjs a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public eqmy f;

    static {
        eqjs eqjsVar = new eqjs();
        a = eqjsVar;
        evsn.registerDefaultInstance(eqjs.class, eqjsVar);
    }

    private eqjs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\f\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eqjs();
        }
        if (iOrdinal == 4) {
            return new eqjr();
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
        synchronized (eqjs.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
