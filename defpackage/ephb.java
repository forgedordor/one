package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephb extends evsn implements evui {
    public static final ephb a;
    private static volatile evuo c;
    public evta b = emptyLongList();

    static {
        ephb ephbVar = new ephb();
        a = ephbVar;
        evsn.registerDefaultInstance(ephb.class, ephbVar);
    }

    private ephb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ephb();
        }
        if (iOrdinal == 4) {
            return new epha();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ephb.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
