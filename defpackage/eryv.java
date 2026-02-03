package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryv extends evsn implements evui {
    public static final eryv a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        eryv eryvVar = new eryv();
        a = eryvVar;
        evsn.registerDefaultInstance(eryv.class, eryvVar);
    }

    private eryv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eryv();
        }
        if (iOrdinal == 4) {
            return new eryu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eryv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
