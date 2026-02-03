package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyuy extends evsn implements evui {
    public static final eyuy a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        eyuy eyuyVar = new eyuy();
        a = eyuyVar;
        evsn.registerDefaultInstance(eyuy.class, eyuyVar);
    }

    private eyuy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", eyuu.class, eyum.class});
        }
        if (iOrdinal == 3) {
            return new eyuy();
        }
        if (iOrdinal == 4) {
            return new eyux();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyuy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
