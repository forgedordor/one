package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewtf extends evsn implements evui {
    public static final ewtf a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ewtf ewtfVar = new ewtf();
        a = ewtfVar;
        evsn.registerDefaultInstance(ewtf.class, ewtfVar);
    }

    private ewtf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", ewtb.class, ewtd.class});
        }
        if (iOrdinal == 3) {
            return new ewtf();
        }
        if (iOrdinal == 4) {
            return new ewte();
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
        synchronized (ewtf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
