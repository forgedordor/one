package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiaw extends evsn implements evui {
    public static final eiaw a;
    private static volatile evuo g;
    public int b;
    public eibc c;
    public long d;
    public long e;
    public int f;

    static {
        eiaw eiawVar = new eiaw();
        a = eiawVar;
        evsn.registerDefaultInstance(eiaw.class, eiawVar);
    }

    private eiaw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eiaw();
        }
        if (iOrdinal == 4) {
            return new eiav();
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
        synchronized (eiaw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
