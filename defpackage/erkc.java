package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erkc extends evsn implements evui {
    public static final erkc a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        erkc erkcVar = new erkc();
        a = erkcVar;
        evsn.registerDefaultInstance(erkc.class, erkcVar);
    }

    private erkc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erkc();
        }
        if (iOrdinal == 4) {
            return new erkb();
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
        synchronized (erkc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
