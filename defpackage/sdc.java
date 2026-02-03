package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdc extends evsn implements evui {
    public static final sdc a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public evtg f = emptyProtobufList();

    static {
        sdc sdcVar = new sdc();
        a = sdcVar;
        evsn.registerDefaultInstance(sdc.class, sdcVar);
    }

    private sdc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", sdb.class});
        }
        if (iOrdinal == 3) {
            return new sdc();
        }
        if (iOrdinal == 4) {
            return new scv();
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
        synchronized (sdc.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
