package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eynf extends evsn implements evui {
    public static final eynf a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public evqs d = evqs.b;
    public evsx e = emptyIntList();
    public String f = "";

    static {
        eynf eynfVar = new eynf();
        a = eynfVar;
        evsn.registerDefaultInstance(eynf.class, eynfVar);
    }

    private eynf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\n\u0003,\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eynf();
        }
        if (iOrdinal == 4) {
            return new eyne();
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
        synchronized (eynf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
