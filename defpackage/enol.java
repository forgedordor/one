package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enol extends evsn implements evui {
    public static final enol a;
    private static volatile evuo i;
    public int b;
    public Object d;
    public int e;
    public enoi g;
    public int h;
    public int c = 0;
    public evqs f = evqs.b;

    static {
        enol enolVar = new enol();
        a = enolVar;
        evsn.registerDefaultInstance(enol.class, enolVar);
    }

    private enol() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003", new Object[]{"d", "c", "b", "e", enok.a, "f", "g", enot.class, enon.class, enor.class, "h", dbxk.a});
        }
        if (iOrdinal == 3) {
            return new enol();
        }
        if (iOrdinal == 4) {
            return new enoj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enol.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
