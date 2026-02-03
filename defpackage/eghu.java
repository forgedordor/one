package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghu extends evsn implements evui {
    public static final eghu a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        eghu eghuVar = new eghu();
        a = eghuVar;
        evsn.registerDefaultInstance(eghu.class, eghuVar);
    }

    private eghu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", eght.a});
        }
        if (iOrdinal == 3) {
            return new eghu();
        }
        if (iOrdinal == 4) {
            return new eghs();
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
        synchronized (eghu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
