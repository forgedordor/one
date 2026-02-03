package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuv extends evsn implements evui {
    public static final euuv a;
    private static volatile evuo h;
    public int d;
    public boolean e;
    public boolean g;
    public String b = "";
    public String c = "";
    public evsx f = emptyIntList();

    static {
        euuv euuvVar = new euuv();
        a = euuvVar;
        evsn.registerDefaultInstance(euuv.class, euuvVar);
    }

    private euuv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\f\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0007\u0007\u000b,\f\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new euuv();
        }
        if (iOrdinal == 4) {
            return new euuu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (euuv.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
