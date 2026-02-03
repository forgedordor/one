package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emaw extends evsn implements evui {
    public static final emaw a;
    private static volatile evuo e;
    public int b;
    public embg c;
    public long d;

    static {
        emaw emawVar = new emaw();
        a = emawVar;
        evsn.registerDefaultInstance(emaw.class, emawVar);
    }

    private emaw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new emaw();
        }
        if (iOrdinal == 4) {
            return new emav();
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
        synchronized (emaw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
