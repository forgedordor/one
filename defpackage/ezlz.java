package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlz extends evsn implements evui {
    public static final ezlz a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public evtg d = emptyProtobufList();

    static {
        ezlz ezlzVar = new ezlz();
        a = ezlzVar;
        evsn.registerDefaultInstance(ezlz.class, ezlzVar);
    }

    private ezlz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", ezmd.class});
        }
        if (iOrdinal == 3) {
            return new ezlz();
        }
        if (iOrdinal == 4) {
            return new ezly();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezlz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
