package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enhw extends evsn implements evui {
    public static final enhw a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";

    static {
        enhw enhwVar = new enhw();
        a = enhwVar;
        evsn.registerDefaultInstance(enhw.class, enhwVar);
    }

    private enhw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", enhv.a, "d", enht.a, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new enhw();
        }
        if (iOrdinal == 4) {
            return new enhu();
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
        synchronized (enhw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
