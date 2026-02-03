package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokj extends evsn implements evui {
    public static final dokj a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dokj dokjVar = new dokj();
        a = dokjVar;
        evsn.registerDefaultInstance(dokj.class, dokjVar);
    }

    private dokj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"c", "b", doki.class, dokf.class});
        }
        if (iOrdinal == 3) {
            return new dokj();
        }
        if (iOrdinal == 4) {
            return new dokg();
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
        synchronized (dokj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
