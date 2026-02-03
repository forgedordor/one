package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvg extends evsn implements evui {
    public static final etvg a;
    private static volatile evuo d;
    public int b;
    public etul c;
    private boolean e;

    static {
        etvg etvgVar = new etvg();
        a = etvgVar;
        evsn.registerDefaultInstance(etvg.class, etvgVar);
    }

    private etvg() {
    }

    public static /* synthetic */ void a(etvg etvgVar) {
        etvgVar.b |= 2;
        etvgVar.e = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
        }
        if (iOrdinal == 3) {
            return new etvg();
        }
        if (iOrdinal == 4) {
            return new etvf();
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
        synchronized (etvg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
