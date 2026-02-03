package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evem extends evsn implements evui {
    public static final evem a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        evem evemVar = new evem();
        a = evemVar;
        evsn.registerDefaultInstance(evem.class, evemVar);
    }

    private evem() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\"\u0002\u0000\u0000\u0000\u0001᠌\u0000\"᠌\u0006", new Object[]{"b", "c", evel.a, "d", evcn.a});
        }
        if (iOrdinal == 3) {
            return new evem();
        }
        if (iOrdinal == 4) {
            return new evek();
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
        synchronized (evem.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
