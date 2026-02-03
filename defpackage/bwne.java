package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwne extends evsn implements evui {
    public static final bwne a;
    private static volatile evuo d;
    public int b;
    public aubq c;

    static {
        bwne bwneVar = new bwne();
        a = bwneVar;
        evsn.registerDefaultInstance(bwne.class, bwneVar);
    }

    private bwne() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bwne();
        }
        if (iOrdinal == 4) {
            return new bwnd();
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
        synchronized (bwne.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
