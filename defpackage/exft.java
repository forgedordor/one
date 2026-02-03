package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exft extends evsn implements evui {
    public static final exft a;
    private static volatile evuo g;
    public int b;
    public int c;
    public evsx d = emptyIntList();
    public int e;
    public int f;

    static {
        exft exftVar = new exft();
        a = exftVar;
        evsn.registerDefaultInstance(exft.class, exftVar);
    }

    private exft() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002,\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exft();
        }
        if (iOrdinal == 4) {
            return new exfs();
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
        synchronized (exft.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
