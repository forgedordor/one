package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermk extends evsn implements evui {
    public static final ermk a;
    private static volatile evuo g;
    public int b;
    public erme c;
    public int d;
    public int e;
    public int f;

    static {
        ermk ermkVar = new ermk();
        a = ermkVar;
        evsn.registerDefaultInstance(ermk.class, ermkVar);
    }

    private ermk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ermk();
        }
        if (iOrdinal == 4) {
            return new ermj();
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
        synchronized (ermk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
