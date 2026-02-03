package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezon extends evsn implements evui {
    public static final ezon a;
    private static volatile evuo d;
    public evqs b = evqs.b;
    public String c = "";

    static {
        ezon ezonVar = new ezon();
        a = ezonVar;
        evsn.registerDefaultInstance(ezon.class, ezonVar);
    }

    private ezon() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezon();
        }
        if (iOrdinal == 4) {
            return new ezom();
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
        synchronized (ezon.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
