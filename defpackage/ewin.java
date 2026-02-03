package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewin extends evsn implements evui {
    public static final ewin a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        ewin ewinVar = new ewin();
        a = ewinVar;
        evsn.registerDefaultInstance(ewin.class, ewinVar);
    }

    private ewin() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ewim.a});
        }
        if (iOrdinal == 3) {
            return new ewin();
        }
        if (iOrdinal == 4) {
            return new ewil();
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
        synchronized (ewin.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
