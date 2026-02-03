package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enao extends evsn implements evui {
    public static final enao a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enao enaoVar = new enao();
        a = enaoVar;
        evsn.registerDefaultInstance(enao.class, enaoVar);
    }

    private enao() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", enag.class, enad.class, enal.class, enaj.class, enan.class});
        }
        if (iOrdinal == 3) {
            return new enao();
        }
        if (iOrdinal == 4) {
            return new enae();
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
        synchronized (enao.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
