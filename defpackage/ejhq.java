package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhq extends evsn implements evui {
    public static final ejhq a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        ejhq ejhqVar = new ejhq();
        a = ejhqVar;
        evsn.registerDefaultInstance(ejhq.class, ejhqVar);
    }

    private ejhq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"f", "b", sqq.a, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejhq();
        }
        if (iOrdinal == 4) {
            return new ejhp();
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
        synchronized (ejhq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
