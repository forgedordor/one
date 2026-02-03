package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzpv extends evsn implements evui {
    public static final dzpv a;
    private static volatile evuo e;
    public String b = "";
    public evtg c = emptyProtobufList();
    public boolean d;
    private int f;

    static {
        dzpv dzpvVar = new dzpv();
        a = dzpvVar;
        evsn.registerDefaultInstance(dzpv.class, dzpvVar);
    }

    private dzpv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"f", "b", "c", dzps.class, "d"});
        }
        if (iOrdinal == 3) {
            return new dzpv();
        }
        if (iOrdinal == 4) {
            return new dzpq();
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
        synchronized (dzpv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
