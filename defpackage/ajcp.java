package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcp extends evsn implements evui {
    public static final ajcp a;
    private static volatile evuo k;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;

    static {
        ajcp ajcpVar = new ajcp();
        a = ajcpVar;
        evsn.registerDefaultInstance(ajcp.class, ajcpVar);
    }

    private ajcp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ajcp();
        }
        if (iOrdinal == 4) {
            return new ajco();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ajcp.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
