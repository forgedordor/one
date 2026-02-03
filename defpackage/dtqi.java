package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqi extends evsn implements evui {
    public static final dtqi a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        dtqi dtqiVar = new dtqi();
        a = dtqiVar;
        evsn.registerDefaultInstance(dtqi.class, dtqiVar);
    }

    private dtqi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", dtqg.a});
        }
        if (iOrdinal == 3) {
            return new dtqi();
        }
        if (iOrdinal == 4) {
            return new dtqf();
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
        synchronized (dtqi.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
