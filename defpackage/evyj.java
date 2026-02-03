package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evyj extends evsn implements evui {
    public static final evyj a;
    private static volatile evuo c;
    public float b;
    private int d;

    static {
        evyj evyjVar = new evyj();
        a = evyjVar;
        evsn.registerDefaultInstance(evyj.class, evyjVar);
    }

    private evyj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new evyj();
        }
        if (iOrdinal == 4) {
            return new evyi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evyj.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
