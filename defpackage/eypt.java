package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypt extends evsn implements evui {
    public static final eypt a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        eypt eyptVar = new eypt();
        a = eyptVar;
        evsn.registerDefaultInstance(eypt.class, eyptVar);
    }

    private eypt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eypt();
        }
        if (iOrdinal == 4) {
            return new eyps();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eypt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
