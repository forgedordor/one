package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfv extends evsn implements evui {
    public static final eyfv a;
    private static volatile evuo f;
    public int b;
    public int d;
    public String c = "";
    public evqs e = evqs.b;

    static {
        eyfv eyfvVar = new eyfv();
        a = eyfvVar;
        evsn.registerDefaultInstance(eyfv.class, eyfvVar);
    }

    private eyfv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", eyft.a, "e"});
        }
        if (iOrdinal == 3) {
            return new eyfv();
        }
        if (iOrdinal == 4) {
            return new eyfs();
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
        synchronized (eyfv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
