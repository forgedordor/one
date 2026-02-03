package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enbx extends evsn implements evui {
    public static final enbx a;
    private static volatile evuo f;
    public int b;
    public long c;
    public int d;
    public int e;

    static {
        enbx enbxVar = new enbx();
        a = enbxVar;
        evsn.registerDefaultInstance(enbx.class, enbxVar);
    }

    private enbx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", "d", enbw.a, "e"});
        }
        if (iOrdinal == 3) {
            return new enbx();
        }
        if (iOrdinal == 4) {
            return new enbv();
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
        synchronized (enbx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
