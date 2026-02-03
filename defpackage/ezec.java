package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezec extends evsn implements evui {
    public static final ezec a;
    private static volatile evuo d;
    public int b;
    public ezor c;

    static {
        ezec ezecVar = new ezec();
        a = ezecVar;
        evsn.registerDefaultInstance(ezec.class, ezecVar);
    }

    private ezec() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezec();
        }
        if (iOrdinal == 4) {
            return new ezeb();
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
        synchronized (ezec.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
