package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyph extends evsn implements evui {
    public static final eyph a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        eyph eyphVar = new eyph();
        a = eyphVar;
        evsn.registerDefaultInstance(eyph.class, eyphVar);
    }

    private eyph() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000fȻ\u0000g<\u0000", new Object[]{"c", "b", "d", eyqf.class, eypb.class});
        }
        if (iOrdinal == 3) {
            return new eyph();
        }
        if (iOrdinal == 4) {
            return new eypg();
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
        synchronized (eyph.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
