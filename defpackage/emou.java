package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emou extends evsn implements evui {
    public static final emou a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        emou emouVar = new emou();
        a = emouVar;
        evsn.registerDefaultInstance(emou.class, emouVar);
    }

    private emou() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003᠌\u0002", new Object[]{"b", "c", emot.a});
        }
        if (iOrdinal == 3) {
            return new emou();
        }
        if (iOrdinal == 4) {
            return new emos();
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
        synchronized (emou.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
