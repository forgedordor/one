package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrk extends evsn implements evui {
    public static final emrk a;
    private static volatile evuo d;
    public int b;
    public emrt c;

    static {
        emrk emrkVar = new emrk();
        a = emrkVar;
        evsn.registerDefaultInstance(emrk.class, emrkVar);
    }

    private emrk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new emrk();
        }
        if (iOrdinal == 4) {
            return new emrj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emrk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
