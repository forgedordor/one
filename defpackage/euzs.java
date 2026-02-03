package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzs extends evsn implements evui {
    public static final euzs a;
    private static volatile evuo f;
    public int b;
    public euzu c;
    public boolean d;
    public euzq e;

    static {
        euzs euzsVar = new euzs();
        a = euzsVar;
        evsn.registerDefaultInstance(euzs.class, euzsVar);
    }

    private euzs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new euzs();
        }
        if (iOrdinal == 4) {
            return new euzr();
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
        synchronized (euzs.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
