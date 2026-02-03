package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eltj extends evsn implements evui {
    public static final eltj a;
    private static volatile evuo g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        eltj eltjVar = new eltj();
        a = eltjVar;
        evsn.registerDefaultInstance(eltj.class, eltjVar);
    }

    private eltj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eltj();
        }
        if (iOrdinal == 4) {
            return new elti();
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
        synchronized (eltj.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
