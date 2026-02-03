package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evzw extends evsn implements evui {
    public static final evzw a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public ewbe d;

    static {
        evzw evzwVar = new evzw();
        a = evzwVar;
        evsn.registerDefaultInstance(evzw.class, evzwVar);
    }

    private evzw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", evzu.class, "d"});
        }
        if (iOrdinal == 3) {
            return new evzw();
        }
        if (iOrdinal == 4) {
            return new evzv();
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
        synchronized (evzw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
