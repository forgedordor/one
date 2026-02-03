package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxa extends evsn implements evui {
    public static final emxa a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        emxa emxaVar = new emxa();
        a = emxaVar;
        evsn.registerDefaultInstance(emxa.class, emxaVar);
    }

    private emxa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new emxa();
        }
        if (iOrdinal == 4) {
            return new emwz();
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
        synchronized (emxa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
