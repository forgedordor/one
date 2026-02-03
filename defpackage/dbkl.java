package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkl extends evsn implements evui {
    public static final dbkl a;
    private static volatile evuo b;

    static {
        dbkl dbklVar = new dbkl();
        a = dbklVar;
        evsn.registerDefaultInstance(dbkl.class, dbklVar);
    }

    private dbkl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new dbkl();
        }
        if (iOrdinal == 4) {
            return new dbkk();
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
        synchronized (dbkl.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
