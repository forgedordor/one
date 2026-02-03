package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoym extends evsn implements evui {
    public static final eoym a;
    private static volatile evuo g;
    public String b = "";
    public int c;
    public int d;
    public boolean e;
    public int f;

    static {
        eoym eoymVar = new eoym();
        a = eoymVar;
        evsn.registerDefaultInstance(eoym.class, eoymVar);
    }

    private eoym() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002Ȉ\u0003\f\u0004\f\u0005\u0007\u0006\f", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eoym();
        }
        if (iOrdinal == 4) {
            return new eoyk();
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
        synchronized (eoym.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
