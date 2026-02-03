package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvy extends evsn implements evui {
    public static final etvy a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        etvy etvyVar = new etvy();
        a = etvyVar;
        evsn.registerDefaultInstance(etvy.class, etvyVar);
    }

    private etvy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etvy();
        }
        if (iOrdinal == 4) {
            return new etvx();
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
        synchronized (etvy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
