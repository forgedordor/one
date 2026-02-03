package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrl extends evsn implements evui {
    public static final ezrl a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public evtg d = emptyProtobufList();

    static {
        ezrl ezrlVar = new ezrl();
        a = ezrlVar;
        evsn.registerDefaultInstance(ezrl.class, ezrlVar);
    }

    private ezrl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", ezol.class});
        }
        if (iOrdinal == 3) {
            return new ezrl();
        }
        if (iOrdinal == 4) {
            return new ezrk();
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
        synchronized (ezrl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
