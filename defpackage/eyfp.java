package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfp extends evsn implements evui {
    public static final eyfp a;
    private static volatile evuo f;
    public int b;
    public eyfn c;
    public eyfn d;
    public evqs e = evqs.b;

    static {
        eyfp eyfpVar = new eyfp();
        a = eyfpVar;
        evsn.registerDefaultInstance(eyfp.class, eyfpVar);
    }

    private eyfp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eyfp();
        }
        if (iOrdinal == 4) {
            return new eyfo();
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
        synchronized (eyfp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
