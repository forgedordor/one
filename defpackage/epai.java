package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epai extends evsn implements evui {
    public static final epai a;
    private static volatile evuo g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public epag f;

    static {
        epai epaiVar = new epai();
        a = epaiVar;
        evsn.registerDefaultInstance(epai.class, epaiVar);
    }

    private epai() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003Ȉ\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new epai();
        }
        if (iOrdinal == 4) {
            return new epah();
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
        synchronized (epai.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
