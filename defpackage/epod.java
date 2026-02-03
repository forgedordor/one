package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epod extends evsn implements evui {
    public static final epod a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        epod epodVar = new epod();
        a = epodVar;
        evsn.registerDefaultInstance(epod.class, epodVar);
    }

    private epod() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epod();
        }
        if (iOrdinal == 4) {
            return new epoc();
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
        synchronized (epod.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
