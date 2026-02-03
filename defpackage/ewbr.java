package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbr extends evsn implements evui {
    public static final ewbr a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        ewbr ewbrVar = new ewbr();
        a = ewbrVar;
        evsn.registerDefaultInstance(ewbr.class, ewbrVar);
    }

    private ewbr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", ewce.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ewbr();
        }
        if (iOrdinal == 4) {
            return new ewbq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewbr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
