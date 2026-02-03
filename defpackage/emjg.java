package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjg extends evsn implements evui {
    public static final emjg a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        emjg emjgVar = new emjg();
        a = emjgVar;
        evsn.registerDefaultInstance(emjg.class, emjgVar);
    }

    private emjg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0006᠌\u0001\u0007᠌\u0002", new Object[]{"b", "c", emji.a, "d", emje.a, "e", emjf.a});
        }
        if (iOrdinal == 3) {
            return new emjg();
        }
        if (iOrdinal == 4) {
            return new emjd();
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
        synchronized (emjg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
