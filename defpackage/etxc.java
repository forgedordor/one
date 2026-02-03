package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxc extends evsn implements evui {
    public static final etxc a;
    private static volatile evuo f;
    public int b;
    public etul c;
    public String d = "";
    public ettv e;

    static {
        etxc etxcVar = new etxc();
        a = etxcVar;
        evsn.registerDefaultInstance(etxc.class, etxcVar);
    }

    private etxc() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etxc();
        }
        if (iOrdinal == 4) {
            return new etxb();
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
        synchronized (etxc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
