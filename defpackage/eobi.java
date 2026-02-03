package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobi extends evsn implements evui {
    public static final eobi a;
    private static volatile evuo l;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        eobi eobiVar = new eobi();
        a = eobiVar;
        evsn.registerDefaultInstance(eobi.class, eobiVar);
    }

    private eobi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = eobg.a;
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", evsvVar, "j", evsvVar, "k", evsvVar});
        }
        if (iOrdinal == 3) {
            return new eobi();
        }
        if (iOrdinal == 4) {
            return new eobf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eobi.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
