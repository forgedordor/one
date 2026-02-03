package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aink extends evsn implements evui {
    public static final aink a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        aink ainkVar = new aink();
        a = ainkVar;
        evsn.registerDefaultInstance(aink.class, ainkVar);
    }

    private aink() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", elle.a, emxs.a});
        }
        if (iOrdinal == 3) {
            return new aink();
        }
        if (iOrdinal == 4) {
            return new ainj();
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
        synchronized (aink.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
