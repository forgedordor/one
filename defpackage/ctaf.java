package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctaf extends evsn implements evui {
    public static final ctaf a;
    private static volatile evuo g;
    public int b;
    public bajo e;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        ctaf ctafVar = new ctaf();
        a = ctafVar;
        evsn.registerDefaultInstance(ctaf.class, ctafVar);
    }

    private ctaf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဉ\u0001\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ctaf();
        }
        if (iOrdinal == 4) {
            return new ctae();
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
        synchronized (ctaf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
