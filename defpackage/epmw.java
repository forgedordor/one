package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epmw extends evsn implements evui {
    public static final epmw a;
    private static volatile evuo c;
    private evub d = evub.a;
    public evqs b = evqs.b;

    static {
        epmw epmwVar = new epmw();
        a = epmwVar;
        evsn.registerDefaultInstance(epmw.class, epmwVar);
    }

    private epmw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\n\u00022", new Object[]{"b", "d", epmu.a});
        }
        if (iOrdinal == 3) {
            return new epmw();
        }
        if (iOrdinal == 4) {
            return new epmv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epmw.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
