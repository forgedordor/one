package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entv extends evsn implements evui {
    public static final entv a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        entv entvVar = new entv();
        a = entvVar;
        evsn.registerDefaultInstance(entv.class, entvVar);
    }

    private entv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", entt.a, "d", entu.a, "e"});
        }
        if (iOrdinal == 3) {
            return new entv();
        }
        if (iOrdinal == 4) {
            return new ents();
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
        synchronized (entv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
