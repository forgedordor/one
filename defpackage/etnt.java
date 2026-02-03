package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnt extends evsn implements evui {
    public static final etnt a;
    private static volatile evuo f;
    public int b;
    public int c;
    public etkx d;
    public etmc e;

    static {
        etnt etntVar = new etnt();
        a = etntVar;
        evsn.registerDefaultInstance(etnt.class, etntVar);
    }

    private etnt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", etnr.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etnt();
        }
        if (iOrdinal == 4) {
            return new etnq();
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
        synchronized (etnt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
