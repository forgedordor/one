package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezwa extends evsn implements evui {
    public static final ezwa a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public int c;

    static {
        ezwa ezwaVar = new ezwa();
        a = ezwaVar;
        evsn.registerDefaultInstance(ezwa.class, ezwaVar);
    }

    private ezwa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", ezol.class, "c"});
        }
        if (iOrdinal == 3) {
            return new ezwa();
        }
        if (iOrdinal == 4) {
            return new ezvz();
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
        synchronized (ezwa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
