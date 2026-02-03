package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elvl extends evsn implements evui {
    public static final elvl a;
    private static volatile evuo h;
    public int b;
    public elpy d;
    public int e;
    public long f;
    public String c = "";
    public evsx g = emptyIntList();

    static {
        elvl elvlVar = new elvl();
        a = elvlVar;
        evsn.registerDefaultInstance(elvl.class, elvlVar);
    }

    private elvl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ࠞ", new Object[]{"b", "c", "d", "e", elva.a, "f", "g", elvj.a});
        }
        if (iOrdinal == 3) {
            return new elvl();
        }
        if (iOrdinal == 4) {
            return new elvi();
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
        synchronized (elvl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
