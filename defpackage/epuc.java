package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuc extends evsn implements evui {
    public static final epuc a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public evqs e;
    public evqs f;
    public evqs g;

    static {
        epuc epucVar = new epuc();
        a = epucVar;
        evsn.registerDefaultInstance(epuc.class, epucVar);
    }

    private epuc() {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.f = evqsVar;
        this.g = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003=\u0000\u0004<\u0000\u0005ည\u0000\u0006ည\u0001\u0007ည\u0002\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"d", "c", "b", eprl.class, epua.class, "e", "f", "g", epru.class, eprz.class, eprb.class, epvt.class});
        }
        if (iOrdinal == 3) {
            return new epuc();
        }
        if (iOrdinal == 4) {
            return new epub();
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
        synchronized (epuc.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
