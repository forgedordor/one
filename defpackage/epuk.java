package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuk extends evsn implements evui {
    public static final epuk a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public epuv e;
    public epwh f;
    public int g;

    static {
        epuk epukVar = new epuk();
        a = epukVar;
        evsn.registerDefaultInstance(epuk.class, epukVar);
    }

    private epuk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002=\u0000\u0004ဋ\u0002\u0005<\u0000\b<\u0000\tဉ\u0001\n<\u0000", new Object[]{"d", "c", "b", "e", "g", epwl.class, epwa.class, "f", eptt.class});
        }
        if (iOrdinal == 3) {
            return new epuk();
        }
        if (iOrdinal == 4) {
            return new epuj();
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
        synchronized (epuk.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
