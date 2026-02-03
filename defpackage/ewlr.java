package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewlr extends evsn implements evui {
    public static final ewlr a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        ewlr ewlrVar = new ewlr();
        a = ewlrVar;
        evsn.registerDefaultInstance(ewlr.class, ewlrVar);
    }

    private ewlr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewlr();
        }
        if (iOrdinal == 4) {
            return new ewlq();
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
        synchronized (ewlr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
