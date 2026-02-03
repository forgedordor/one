package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evno extends evsn implements evui {
    public static final evno a;
    private static volatile evuo j;
    public int b;
    public int g;
    public int i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public evtg h = emptyProtobufList();

    static {
        evno evnoVar = new evno();
        a = evnoVar;
        evsn.registerDefaultInstance(evno.class, evnoVar);
    }

    private evno() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006\u001b\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", evnm.a, "h", evoj.class, "i"});
        }
        if (iOrdinal == 3) {
            return new evno();
        }
        if (iOrdinal == 4) {
            return new evnl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evno.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
