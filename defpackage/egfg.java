package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfg extends evsn implements evui {
    public static final egfg a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public evtg d = evsn.emptyProtobufList();
    public int e;

    static {
        egfg egfgVar = new egfg();
        a = egfgVar;
        evsn.registerDefaultInstance(egfg.class, egfgVar);
    }

    private egfg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003᠌\u0001", new Object[]{"b", "c", "d", "e", egfe.a});
        }
        if (iOrdinal == 3) {
            return new egfg();
        }
        if (iOrdinal == 4) {
            return new egfd();
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
        synchronized (egfg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
