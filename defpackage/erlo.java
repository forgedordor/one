package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erlo extends evsn implements evui {
    public static final erlo a;
    private static volatile evuo f;
    public int b;
    public erlq c;
    public int d;
    public int e;

    static {
        erlo erloVar = new erlo();
        a = erloVar;
        evsn.registerDefaultInstance(erlo.class, erloVar);
    }

    private erlo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new erlo();
        }
        if (iOrdinal == 4) {
            return new erln();
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
        synchronized (erlo.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
