package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emee extends evsn implements evui {
    public static final emee a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        emee emeeVar = new emee();
        a = emeeVar;
        evsn.registerDefaultInstance(emee.class, emeeVar);
    }

    private emee() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new emee();
        }
        if (iOrdinal == 4) {
            return new emed();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emee.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
