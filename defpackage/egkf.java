package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkf extends evsn implements evui {
    public static final egkf a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        egkf egkfVar = new egkf();
        a = egkfVar;
        evsn.registerDefaultInstance(egkf.class, egkfVar);
    }

    private egkf() {
    }

    public final evub a() {
        evub evubVar = this.b;
        if (!evubVar.b) {
            this.b = evubVar.a();
        }
        return this.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", egke.a});
        }
        if (iOrdinal == 3) {
            return new egkf();
        }
        if (iOrdinal == 4) {
            return new egkd();
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
        synchronized (egkf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
