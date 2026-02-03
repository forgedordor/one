package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegh extends evsn implements evui {
    public static final fegh a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public evtg f = emptyProtobufList();

    static {
        fegh feghVar = new fegh();
        a = feghVar;
        evsn.registerDefaultInstance(fegh.class, feghVar);
    }

    private fegh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u00028\u0000\u0003<\u0000\u0004\u001b", new Object[]{"d", "c", "b", "e", fegf.a, fega.class, "f", fege.class});
        }
        if (iOrdinal == 3) {
            return new fegh();
        }
        if (iOrdinal == 4) {
            return new fegc();
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
        synchronized (fegh.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
