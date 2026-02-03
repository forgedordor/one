package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqj extends evsn implements evui {
    public static final ezqj a;
    private static volatile evuo f;
    public int b;
    public ezpp c;
    public ezol d;
    public evtg e = emptyProtobufList();

    static {
        ezqj ezqjVar = new ezqj();
        a = ezqjVar;
        evsn.registerDefaultInstance(ezqj.class, ezqjVar);
    }

    private ezqj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", ezol.class});
        }
        if (iOrdinal == 3) {
            return new ezqj();
        }
        if (iOrdinal == 4) {
            return new ezqi();
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
        synchronized (ezqj.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
