package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ells extends evsn implements evui {
    public static final ells a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ells ellsVar = new ells();
        a = ellsVar;
        evsn.registerDefaultInstance(ells.class, ellsVar);
    }

    private ells() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", ellp.a, "d", elln.a, "e", ellq.a});
        }
        if (iOrdinal == 3) {
            return new ells();
        }
        if (iOrdinal == 4) {
            return new ello();
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
        synchronized (ells.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
