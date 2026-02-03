package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emeu extends evsn implements evui {
    public static final emeu a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public boolean d;
    public int e;

    static {
        emeu emeuVar = new emeu();
        a = emeuVar;
        evsn.registerDefaultInstance(emeu.class, emeuVar);
    }

    private emeu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new emeu();
        }
        if (iOrdinal == 4) {
            return new emet();
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
        synchronized (emeu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
