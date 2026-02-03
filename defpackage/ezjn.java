package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjn extends evsn<ezjn, ezjm> implements evui {
    public static final ezjn a;
    private static volatile evuo d;
    public ezpr b;
    public long c;
    private int e;

    static {
        ezjn ezjnVar = new ezjn();
        a = ezjnVar;
        evsn.registerDefaultInstance(ezjn.class, ezjnVar);
    }

    private ezjn() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezjn();
        }
        if (iOrdinal == 4) {
            return new ezjm();
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
        synchronized (ezjn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
