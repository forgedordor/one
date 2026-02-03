package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdn extends evsn implements evui {
    public static final dbdn a;
    private static volatile evuo d;
    public String b = "";
    public int c;
    private int e;

    static {
        dbdn dbdnVar = new dbdn();
        a = dbdnVar;
        evsn.registerDefaultInstance(dbdn.class, dbdnVar);
    }

    private dbdn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0003ဌ\u0002", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new dbdn();
        }
        if (iOrdinal == 4) {
            return new dbdm();
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
        synchronized (dbdn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
