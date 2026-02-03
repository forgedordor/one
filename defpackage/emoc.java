package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoc extends evsn implements evui {
    public static final emoc a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public int d;

    static {
        emoc emocVar = new emoc();
        a = emocVar;
        evsn.registerDefaultInstance(emoc.class, emocVar);
    }

    private emoc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", emnz.a});
        }
        if (iOrdinal == 3) {
            return new emoc();
        }
        if (iOrdinal == 4) {
            return new emob();
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
        synchronized (emoc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
