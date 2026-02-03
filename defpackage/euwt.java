package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwt extends evsn implements evui {
    public static final euwt a;
    private static volatile evuo f;
    public int b;
    public float c;
    public String d = "";
    public String e = "";
    private int g;

    static {
        euwt euwtVar = new euwt();
        a = euwtVar;
        evsn.registerDefaultInstance(euwt.class, euwtVar);
    }

    private euwt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new euwt();
        }
        if (iOrdinal == 4) {
            return new euws();
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
        synchronized (euwt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
