package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgkl extends evsn implements evui {
    public static final cgkl a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;

    static {
        cgkl cgklVar = new cgkl();
        a = cgklVar;
        evsn.registerDefaultInstance(cgkl.class, cgklVar);
    }

    private cgkl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", cgle.a, "f", cgpd.class, cgrk.class, cgrq.class});
        }
        if (iOrdinal == 3) {
            return new cgkl();
        }
        if (iOrdinal == 4) {
            return new cgkk();
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
        synchronized (cgkl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
