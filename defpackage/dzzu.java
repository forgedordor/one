package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzu extends evsn implements evui {
    public static final dzzu a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public evqs d = evqs.b;
    public String e = "";
    public evtg f = emptyProtobufList();
    public evtg g = evsn.emptyProtobufList();
    public boolean h;
    public long i;

    static {
        dzzu dzzuVar = new dzzu();
        a = dzzuVar;
        evsn.registerDefaultInstance(dzzu.class, dzzuVar);
    }

    private dzzu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", dzzz.class, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dzzu();
        }
        if (iOrdinal == 4) {
            return new dzzt();
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
        synchronized (dzzu.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
