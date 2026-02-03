package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emuu extends evsn implements evui {
    public static final emuu a;
    private static volatile evuo e;
    public int b;
    public emub c;
    public emub d;

    static {
        emuu emuuVar = new emuu();
        a = emuuVar;
        evsn.registerDefaultInstance(emuu.class, emuuVar);
    }

    private emuu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new emuu();
        }
        if (iOrdinal == 4) {
            return new emut();
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
        synchronized (emuu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
