package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuv extends evsn implements evui {
    public static final epuv a;
    private static volatile evuo h;
    public int b;
    public evqs c;
    public String d;
    public evqs e;
    public evqs f;
    public String g;

    static {
        epuv epuvVar = new epuv();
        a = epuvVar;
        evsn.registerDefaultInstance(epuv.class, epuvVar);
    }

    private epuv() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = "";
        this.e = evqsVar;
        this.f = evqsVar;
        this.g = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ည\u0003\u0005ည\u0004\u0006ለ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new epuv();
        }
        if (iOrdinal == 4) {
            return new epuu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epuv.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
