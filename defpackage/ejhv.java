package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhv extends evsn implements evui {
    public static final ejhv a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        ejhv ejhvVar = new ejhv();
        a = ejhvVar;
        evsn.registerDefaultInstance(ejhv.class, ejhvVar);
    }

    private ejhv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ejhv();
        }
        if (iOrdinal == 4) {
            return new ejhu();
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
        synchronized (ejhv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
