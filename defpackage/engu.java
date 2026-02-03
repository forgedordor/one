package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engu extends evsn implements evui {
    public static final engu a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        engu enguVar = new engu();
        a = enguVar;
        evsn.registerDefaultInstance(engu.class, enguVar);
    }

    private engu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001e\u0002\u0000\u0000\u0000\u0001ဇ\u0000e<\u0000", new Object[]{"d", "c", "b", "e", engw.class});
        }
        if (iOrdinal == 3) {
            return new engu();
        }
        if (iOrdinal == 4) {
            return new engt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (engu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
