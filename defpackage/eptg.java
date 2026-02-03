package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eptg extends evsn implements evui {
    public static final eptg a;
    private static volatile evuo c;
    public long b;
    private int d;

    static {
        eptg eptgVar = new eptg();
        a = eptgVar;
        evsn.registerDefaultInstance(eptg.class, eptgVar);
    }

    private eptg() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဃ\u0003", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eptg();
        }
        if (iOrdinal == 4) {
            return new eptf();
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
        synchronized (eptg.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
