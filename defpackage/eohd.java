package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohd extends evsn implements evui {
    public static final eohd a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public eohi e;

    static {
        eohd eohdVar = new eohd();
        a = eohdVar;
        evsn.registerDefaultInstance(eohd.class, eohdVar);
    }

    private eohd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", eohc.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eohd();
        }
        if (iOrdinal == 4) {
            return new eohb();
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
        synchronized (eohd.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
