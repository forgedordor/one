package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctho extends evsn implements evui {
    public static final ctho a;
    private static volatile evuo f;
    public int d;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        ctho cthoVar = new ctho();
        a = cthoVar;
        evsn.registerDefaultInstance(ctho.class, cthoVar);
    }

    private ctho() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ctho();
        }
        if (iOrdinal == 4) {
            return new cthn();
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
        synchronized (ctho.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
