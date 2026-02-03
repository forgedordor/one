package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exyn extends evsn implements evui {
    public static final exyn a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = emptyProtobufList();
    private int e;

    static {
        exyn exynVar = new exyn();
        a = exynVar;
        evsn.registerDefaultInstance(exyn.class, exynVar);
    }

    private exyn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", exym.class});
        }
        if (iOrdinal == 3) {
            return new exyn();
        }
        if (iOrdinal == 4) {
            return new exyk();
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
        synchronized (exyn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
