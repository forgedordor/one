package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqim extends evsn implements evui {
    public static final eqim a;
    private static volatile evuo e;
    public int b;
    public eqny c;
    public evtg d = evsn.emptyProtobufList();

    static {
        eqim eqimVar = new eqim();
        a = eqimVar;
        evsn.registerDefaultInstance(eqim.class, eqimVar);
    }

    private eqim() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0000\u0001Țϧဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new eqim();
        }
        if (iOrdinal == 4) {
            return new eqil();
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
        synchronized (eqim.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
