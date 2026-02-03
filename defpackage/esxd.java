package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxd extends evsn implements evui {
    public static final esxd a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public esxc d;

    static {
        esxd esxdVar = new esxd();
        a = esxdVar;
        evsn.registerDefaultInstance(esxd.class, esxdVar);
    }

    private esxd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", esxa.class, "d"});
        }
        if (iOrdinal == 3) {
            return new esxd();
        }
        if (iOrdinal == 4) {
            return new eswy();
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
        synchronized (esxd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
