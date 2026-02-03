package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxa extends evsn implements evui {
    public static final esxa a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        esxa esxaVar = new esxa();
        a = esxaVar;
        evsn.registerDefaultInstance(esxa.class, esxaVar);
    }

    private esxa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u00027\u0000\u0003:\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new esxa();
        }
        if (iOrdinal == 4) {
            return new eswz();
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
        synchronized (esxa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
