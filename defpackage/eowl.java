package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowl extends evsn implements evui {
    public static final eowl a;
    private static volatile evuo h;
    public int b;
    public boolean d;
    public int e;
    public epbx g;
    public String c = "";
    public String f = "";

    static {
        eowl eowlVar = new eowl();
        a = eowlVar;
        evsn.registerDefaultInstance(eowl.class, eowlVar);
    }

    private eowl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004Ȉ\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eowl();
        }
        if (iOrdinal == 4) {
            return new eowj();
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
        synchronized (eowl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
