package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlf extends evsn implements evui {
    public static final ezlf a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public String d = "";
    public ezlj e;
    public ezle f;

    static {
        ezlf ezlfVar = new ezlf();
        a = ezlfVar;
        evsn.registerDefaultInstance(ezlf.class, ezlfVar);
    }

    private ezlf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezlf();
        }
        if (iOrdinal == 4) {
            return new ezlc();
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
        synchronized (ezlf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
