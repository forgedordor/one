package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enie extends evsn implements evui {
    public static final enie a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enie enieVar = new enie();
        a = enieVar;
        evsn.registerDefaultInstance(enie.class, enieVar);
    }

    private enie() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", enix.class, enik.class, enjk.class, enig.class, enic.class, enjm.class, enit.class, eniv.class, enii.class});
        }
        if (iOrdinal == 3) {
            return new enie();
        }
        if (iOrdinal == 4) {
            return new enid();
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
        synchronized (enie.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
