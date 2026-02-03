package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyuq extends evsn implements evui {
    public static final eyuq a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();

    static {
        eyuq eyuqVar = new eyuq();
        a = eyuqVar;
        evsn.registerDefaultInstance(eyuq.class, eyuqVar);
    }

    private eyuq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u001b", new Object[]{"b", "c", "d", eyvc.class});
        }
        if (iOrdinal == 3) {
            return new eyuq();
        }
        if (iOrdinal == 4) {
            return new eyup();
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
        synchronized (eyuq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
