package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbr extends evsn implements evui {
    public static final epbr a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        epbr epbrVar = new epbr();
        a = epbrVar;
        evsn.registerDefaultInstance(epbr.class, epbrVar);
    }

    private epbr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new epbr();
        }
        if (iOrdinal == 4) {
            return new epbq();
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
        synchronized (epbr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
