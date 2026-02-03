package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucx extends evsn implements evui {
    public static final aucx a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public int d;

    static {
        aucx aucxVar = new aucx();
        a = aucxVar;
        evsn.registerDefaultInstance(aucx.class, aucxVar);
    }

    private aucx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", avod.a});
        }
        if (iOrdinal == 3) {
            return new aucx();
        }
        if (iOrdinal == 4) {
            return new aucw();
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
        synchronized (aucx.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
