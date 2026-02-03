package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkd extends evsn implements evui {
    public static final epkd a;
    private static volatile evuo g;
    public Object c;
    public boolean e;
    public int f;
    public int b = 0;
    public String d = "";

    static {
        epkd epkdVar = new epkd();
        a = epkdVar;
        evsn.registerDefaultInstance(epkd.class, epkdVar);
    }

    private epkd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ\u0003\u0007\u0004\f\u0005Ȼ\u0000", new Object[]{"c", "b", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new epkd();
        }
        if (iOrdinal == 4) {
            return new epkc();
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
        synchronized (epkd.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
