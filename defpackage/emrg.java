package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrg extends evsn implements evui {
    public static final emrg a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        emrg emrgVar = new emrg();
        a = emrgVar;
        evsn.registerDefaultInstance(emrg.class, emrgVar);
    }

    private emrg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new emrg();
        }
        if (iOrdinal == 4) {
            return new emrf();
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
        synchronized (emrg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
