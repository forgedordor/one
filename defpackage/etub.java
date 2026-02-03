package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etub extends evsn implements evui {
    public static final etub a;
    private static volatile evuo f;
    public int b;
    public etwu d;
    public String c = "";
    public String e = "";

    static {
        etub etubVar = new etub();
        a = etubVar;
        evsn.registerDefaultInstance(etub.class, etubVar);
    }

    private etub() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etub();
        }
        if (iOrdinal == 4) {
            return new etua();
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
        synchronized (etub.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
