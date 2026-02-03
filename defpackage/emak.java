package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emak extends evsn implements evui {
    public static final emak a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        emak emakVar = new emak();
        a = emakVar;
        evsn.registerDefaultInstance(emak.class, emakVar);
    }

    private emak() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", emaj.a});
        }
        if (iOrdinal == 3) {
            return new emak();
        }
        if (iOrdinal == 4) {
            return new emai();
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
        synchronized (emak.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
