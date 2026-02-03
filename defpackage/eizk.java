package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizk extends evsn implements evui {
    public static final eizk a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eizk eizkVar = new eizk();
        a = eizkVar;
        evsn.registerDefaultInstance(eizk.class, eizkVar);
    }

    private eizk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001:\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new eizk();
        }
        if (iOrdinal == 4) {
            return new eizj();
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
        synchronized (eizk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
