package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sej extends evsn implements evui {
    public static final sej a;
    private static volatile evuo f;
    public int b;
    public long c;
    public int d;
    public int e;

    static {
        sej sejVar = new sej();
        a = sejVar;
        evsn.registerDefaultInstance(sej.class, sejVar);
    }

    private sej() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", sfh.a, "e", sfc.a});
        }
        if (iOrdinal == 3) {
            return new sej();
        }
        if (iOrdinal == 4) {
            return new sei();
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
        synchronized (sej.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
