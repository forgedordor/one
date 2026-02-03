package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgq extends evsn implements evui {
    public static final etgq a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        etgq etgqVar = new etgq();
        a = etgqVar;
        evsn.registerDefaultInstance(etgq.class, etgqVar);
    }

    private etgq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etgq();
        }
        if (iOrdinal == 4) {
            return new etgp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etgq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
