package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozy extends evsn implements evui {
    public static final eozy a;
    private static volatile evuo d;
    public String b = "";
    public boolean c;

    static {
        eozy eozyVar = new eozy();
        a = eozyVar;
        evsn.registerDefaultInstance(eozy.class, eozyVar);
    }

    private eozy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eozy();
        }
        if (iOrdinal == 4) {
            return new eozx();
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
        synchronized (eozy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
