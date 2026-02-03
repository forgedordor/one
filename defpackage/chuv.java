package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chuv extends evsn implements evui {
    public static final chuv a;
    private static volatile evuo f;
    public int b;
    public evqs c = evqs.b;
    public String d = "";
    public chuz e;

    static {
        chuv chuvVar = new chuv();
        a = chuvVar;
        evsn.registerDefaultInstance(chuv.class, chuvVar);
    }

    private chuv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new chuv();
        }
        if (iOrdinal == 4) {
            return new chuu();
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
        synchronized (chuv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
