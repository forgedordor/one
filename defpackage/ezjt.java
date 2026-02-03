package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjt extends evsn implements evui {
    public static final ezjt a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public evtg d = emptyProtobufList();
    public boolean e;
    public ezie f;

    static {
        ezjt ezjtVar = new ezjt();
        a = ezjtVar;
        evsn.registerDefaultInstance(ezjt.class, ezjtVar);
    }

    private ezjt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0007\u0005ဉ\u0002", new Object[]{"b", "c", "d", ezol.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezjt();
        }
        if (iOrdinal == 4) {
            return new ezjs();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezjt.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
