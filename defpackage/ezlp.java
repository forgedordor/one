package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlp extends evsn implements evui {
    public static final ezlp a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public ezol d;
    public ezlj e;
    public ezjf f;

    static {
        ezlp ezlpVar = new ezlp();
        a = ezlpVar;
        evsn.registerDefaultInstance(ezlp.class, ezlpVar);
    }

    private ezlp() {
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
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0006\u001a\u0004\u0000\u0000\u0000\u0006ဉ\u0000\nဉ\u0001\u0012ဉ\u0002\u001aဉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezlp();
        }
        if (iOrdinal == 4) {
            return new ezlo();
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
        synchronized (ezlp.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
