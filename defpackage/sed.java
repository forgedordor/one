package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sed extends evsn implements evui {
    public static final sed a;
    private static volatile evuo h;
    public int b;
    public long e;
    public sdx g;
    public String c = "";
    public String d = "";
    public evtg f = emptyProtobufList();

    static {
        sed sedVar = new sed();
        a = sedVar;
        evsn.registerDefaultInstance(sed.class, sedVar);
    }

    private sed() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဃ\u0004\u0006\u001b\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", sdz.class, "g"});
        }
        if (iOrdinal == 3) {
            return new sed();
        }
        if (iOrdinal == 4) {
            return new sec();
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
        synchronized (sed.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
