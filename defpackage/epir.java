package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epir extends evsn implements evui {
    public static final epir a;
    private static volatile evuo d;
    public String b = "";
    public int c;

    static {
        epir epirVar = new epir();
        a = epirVar;
        evsn.registerDefaultInstance(epir.class, epirVar);
    }

    private epir() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new epir();
        }
        if (iOrdinal == 4) {
            return new epiq();
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
        synchronized (epir.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
