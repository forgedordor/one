package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuf extends evsn implements evui {
    public static final enuf a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        enuf enufVar = new enuf();
        a = enufVar;
        evsn.registerDefaultInstance(enuf.class, enufVar);
    }

    private enuf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", enue.a});
        }
        if (iOrdinal == 3) {
            return new enuf();
        }
        if (iOrdinal == 4) {
            return new enud();
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
        synchronized (enuf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
