package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrv extends evsn implements evui {
    public static final ahrv a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ahrv ahrvVar = new ahrv();
        a = ahrvVar;
        evsn.registerDefaultInstance(ahrv.class, ahrvVar);
    }

    private ahrv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", ahrs.class, ahrm.class});
        }
        if (iOrdinal == 3) {
            return new ahrv();
        }
        if (iOrdinal == 4) {
            return new ahru();
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
        synchronized (ahrv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
