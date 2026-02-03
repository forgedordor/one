package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epac extends evsn implements evui {
    public static final epac a;
    private static volatile evuo g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public boolean f;

    static {
        epac epacVar = new epac();
        a = epacVar;
        evsn.registerDefaultInstance(epac.class, epacVar);
    }

    private epac() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0003\u0007\u0005\u0000\u0000\u0000\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004", new Object[]{"d", "e", "f", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new epac();
        }
        if (iOrdinal == 4) {
            return new epab();
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
        synchronized (epac.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
