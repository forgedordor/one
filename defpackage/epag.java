package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epag extends evsn implements evui {
    public static final epag a;
    private static volatile evuo d;
    public String b = "";
    public long c;

    static {
        epag epagVar = new epag();
        a = epagVar;
        evsn.registerDefaultInstance(epag.class, epagVar);
    }

    private epag() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new epag();
        }
        if (iOrdinal == 4) {
            return new epaf();
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
        synchronized (epag.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
