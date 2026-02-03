package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enss extends evsn implements evui {
    public static final enss a;
    private static volatile evuo g;
    public int b;
    public ensr c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        enss enssVar = new enss();
        a = enssVar;
        evsn.registerDefaultInstance(enss.class, enssVar);
    }

    private enss() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new enss();
        }
        if (iOrdinal == 4) {
            return new ensp();
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
        synchronized (enss.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
