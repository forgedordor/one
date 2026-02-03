package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiyg extends evsn implements evui {
    public static final evsy a = new aiye();
    public static final aiyg b;
    private static volatile evuo h;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public evsx g = emptyIntList();

    static {
        aiyg aiygVar = new aiyg();
        b = aiygVar;
        evsn.registerDefaultInstance(aiyg.class, aiygVar);
    }

    private aiyg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ࠬ", new Object[]{"c", "d", "e", "f", "g", aiyh.a});
        }
        if (iOrdinal == 3) {
            return new aiyg();
        }
        if (iOrdinal == 4) {
            return new aiyf();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aiyg.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
