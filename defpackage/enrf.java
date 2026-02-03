package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enrf extends evsn implements evui {
    public static final enrf a;
    private static volatile evuo g;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public String f = "";

    static {
        enrf enrfVar = new enrf();
        a = enrfVar;
        evsn.registerDefaultInstance(enrf.class, enrfVar);
    }

    private enrf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"b", "f"});
        }
        if (iOrdinal == 3) {
            return new enrf();
        }
        if (iOrdinal == 4) {
            return new enre();
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
        synchronized (enrf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
