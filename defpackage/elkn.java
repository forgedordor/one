package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elkn extends evsn implements evui {
    public static final elkn a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        elkn elknVar = new elkn();
        a = elknVar;
        evsn.registerDefaultInstance(elkn.class, elknVar);
    }

    private elkn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", emun.class, emva.class, emup.class});
        }
        if (iOrdinal == 3) {
            return new elkn();
        }
        if (iOrdinal == 4) {
            return new elkm();
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
        synchronized (elkn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
