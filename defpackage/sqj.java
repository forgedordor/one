package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqj extends evsn implements evui {
    public static final sqj a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public float e;
    public sqf f;

    static {
        sqj sqjVar = new sqj();
        a = sqjVar;
        evsn.registerDefaultInstance(sqj.class, sqjVar);
    }

    private sqj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u000b\u0003\u000b\u0004\u0001\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new sqj();
        }
        if (iOrdinal == 4) {
            return new sqi();
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
        synchronized (sqj.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
