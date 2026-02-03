package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizo extends evsn implements evui {
    public static final eizo a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        eizo eizoVar = new eizo();
        a = eizoVar;
        evsn.registerDefaultInstance(eizo.class, eizoVar);
    }

    private eizo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eizo();
        }
        if (iOrdinal == 4) {
            return new eizn();
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
        synchronized (eizo.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
