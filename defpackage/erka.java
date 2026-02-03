package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erka extends evsn implements evui {
    public static final erka a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        erka erkaVar = new erka();
        a = erkaVar;
        evsn.registerDefaultInstance(erka.class, erkaVar);
    }

    private erka() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erka();
        }
        if (iOrdinal == 4) {
            return new erjz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (erka.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
