package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezry extends evsn implements evui {
    public static final ezry a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ezry ezryVar = new ezry();
        a = ezryVar;
        evsn.registerDefaultInstance(ezry.class, ezryVar);
    }

    private ezry() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", ezol.class});
        }
        if (iOrdinal == 3) {
            return new ezry();
        }
        if (iOrdinal == 4) {
            return new ezrx();
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
        synchronized (ezry.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
