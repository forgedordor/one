package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxc extends evsn implements evui {
    public static final dbxc a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dbxc dbxcVar = new dbxc();
        a = dbxcVar;
        evsn.registerDefaultInstance(dbxc.class, dbxcVar);
    }

    private dbxc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", dbxn.class});
        }
        if (iOrdinal == 3) {
            return new dbxc();
        }
        if (iOrdinal == 4) {
            return new dbxb();
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
        synchronized (dbxc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
