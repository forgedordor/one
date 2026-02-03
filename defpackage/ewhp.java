package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewhp extends evsn implements evui {
    public static final ewhp a;
    private static volatile evuo f;
    public int b;
    public int c;
    public ewhs d;
    public int e;

    static {
        ewhp ewhpVar = new ewhp();
        a = ewhpVar;
        evsn.registerDefaultInstance(ewhp.class, ewhpVar);
    }

    private ewhp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", ewhn.a, "d", "e", ewho.a});
        }
        if (iOrdinal == 3) {
            return new ewhp();
        }
        if (iOrdinal == 4) {
            return new ewhm();
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
        synchronized (ewhp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
