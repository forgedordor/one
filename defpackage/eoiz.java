package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoiz extends evsn implements evui {
    public static final eoiz a;
    private static volatile evuo i;
    public int b;
    public long d;
    public eokf g;
    public int h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        eoiz eoizVar = new eoiz();
        a = eoizVar;
        evsn.registerDefaultInstance(eoiz.class, eoizVar);
    }

    private eoiz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", eokp.a});
        }
        if (iOrdinal == 3) {
            return new eoiz();
        }
        if (iOrdinal == 4) {
            return new eoiy();
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
        synchronized (eoiz.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
