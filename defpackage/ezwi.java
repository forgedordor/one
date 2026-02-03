package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezwi extends evsn implements evui {
    public static final ezwi a;
    private static volatile evuo c;
    public ezpr b;
    private int d;

    static {
        ezwi ezwiVar = new ezwi();
        a = ezwiVar;
        evsn.registerDefaultInstance(ezwi.class, ezwiVar);
    }

    private ezwi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ezwi();
        }
        if (iOrdinal == 4) {
            return new ezwh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezwi.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
