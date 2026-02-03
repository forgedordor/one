package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizm extends evsn implements evui {
    public static final eizm a;
    private static volatile evuo c;
    public boolean b;

    static {
        eizm eizmVar = new eizm();
        a = eizmVar;
        evsn.registerDefaultInstance(eizm.class, eizmVar);
    }

    private eizm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eizm();
        }
        if (iOrdinal == 4) {
            return new eizl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eizm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
