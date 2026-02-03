package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evds extends evsn implements evui {
    public static final evds a;
    private static volatile evuo f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        evds evdsVar = new evds();
        a = evdsVar;
        evsn.registerDefaultInstance(evds.class, evdsVar);
    }

    private evds() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0005ဈ\u0005\b᠌\b", new Object[]{"b", "c", evdq.a, "d", "e", evdr.a});
        }
        if (iOrdinal == 3) {
            return new evds();
        }
        if (iOrdinal == 4) {
            return new evdp();
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
        synchronized (evds.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
