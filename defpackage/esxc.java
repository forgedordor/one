package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxc extends evsn implements evui {
    public static final esxc a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        esxc esxcVar = new esxc();
        a = esxcVar;
        evsn.registerDefaultInstance(esxc.class, esxcVar);
    }

    private esxc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"c", "b", esww.class});
        }
        if (iOrdinal == 3) {
            return new esxc();
        }
        if (iOrdinal == 4) {
            return new esxb();
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
        synchronized (esxc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
