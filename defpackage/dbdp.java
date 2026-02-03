package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdp extends evsn implements evui {
    public static final dbdp a;
    private static volatile evuo b;

    static {
        dbdp dbdpVar = new dbdp();
        a = dbdpVar;
        evsn.registerDefaultInstance(dbdp.class, dbdpVar);
    }

    private dbdp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dbdp();
        }
        if (iOrdinal == 4) {
            return new dbdo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbdp.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
