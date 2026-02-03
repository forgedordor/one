package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eure extends evsn implements evui {
    public static final eure a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public eurc f;
    public long g;

    static {
        eure eureVar = new eure();
        a = eureVar;
        evsn.registerDefaultInstance(eure.class, eureVar);
    }

    private eure() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဂ\u0000\u0004ဉ\u0001\u0005ဂ\u0002\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", eury.class, eurs.class, "e", "f", "g", euqm.class, euqo.class, eurg.class, euru.class, euqx.class, euri.class, euqk.class, euqi.class, eurw.class});
        }
        if (iOrdinal == 3) {
            return new eure();
        }
        if (iOrdinal == 4) {
            return new eurd();
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
        synchronized (eure.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
