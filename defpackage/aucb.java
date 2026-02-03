package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucb extends evsn implements evui {
    public static final aucb a;
    private static volatile evuo g;
    public int b;
    public boolean d;
    public auib e;
    public String c = "";
    public String f = "";

    static {
        aucb aucbVar = new aucb();
        a = aucbVar;
        evsn.registerDefaultInstance(aucb.class, aucbVar);
    }

    private aucb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aucb();
        }
        if (iOrdinal == 4) {
            return new auca();
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
        synchronized (aucb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
