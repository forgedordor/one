package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezcr extends evsn implements evui {
    public static final ezcr a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        ezcr ezcrVar = new ezcr();
        a = ezcrVar;
        evsn.registerDefaultInstance(ezcr.class, ezcrVar);
    }

    private ezcr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezcr();
        }
        if (iOrdinal == 4) {
            return new ezcq();
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
        synchronized (ezcr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
