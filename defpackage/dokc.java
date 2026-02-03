package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokc extends evsn implements evui {
    public static final dokc a;
    private static volatile evuo d;
    public int b;
    public dokx c;

    static {
        dokc dokcVar = new dokc();
        a = dokcVar;
        evsn.registerDefaultInstance(dokc.class, dokcVar);
    }

    private dokc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001dd\u0001\u0000\u0000\u0000dဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dokc();
        }
        if (iOrdinal == 4) {
            return new dokb();
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
        synchronized (dokc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
