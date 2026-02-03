package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwk extends evsn implements evui {
    public static final etwk a;
    private static volatile evuo e;
    public int b;
    public etul c;
    public String d = "";

    static {
        etwk etwkVar = new etwk();
        a = etwkVar;
        evsn.registerDefaultInstance(etwk.class, etwkVar);
    }

    private etwk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etwk();
        }
        if (iOrdinal == 4) {
            return new etwj();
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
        synchronized (etwk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
