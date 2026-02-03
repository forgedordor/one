package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmh extends evsn implements evui {
    public static final elmh a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        elmh elmhVar = new elmh();
        a = elmhVar;
        evsn.registerDefaultInstance(elmh.class, elmhVar);
    }

    private elmh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", elmd.a, "d", "e", elmf.a, "f", elmg.a});
        }
        if (iOrdinal == 3) {
            return new elmh();
        }
        if (iOrdinal == 4) {
            return new elme();
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
        synchronized (elmh.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
