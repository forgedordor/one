package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epun extends evsn implements evui {
    public static final epun a;
    private static volatile evuo i;
    public int b;
    public int c = 0;
    public Object d;
    public evqs e;
    public evqs f;
    public long g;
    public int h;

    static {
        epun epunVar = new epun();
        a = epunVar;
        evsn.registerDefaultInstance(epun.class, epunVar);
    }

    private epun() {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.f = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\tည\u0001\n<\u0000\u000bဃ\u0002\fဋ\u0003\r<\u0000", new Object[]{"d", "c", "b", "e", eprr.class, epte.class, epuc.class, eput.class, epuf.class, epsn.class, epty.class, "f", epuy.class, "g", "h", epwa.class});
        }
        if (iOrdinal == 3) {
            return new epun();
        }
        if (iOrdinal == 4) {
            return new epum();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epun.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
