package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scy extends evsn implements evui {
    public static final scy a;
    private static volatile evuo c;
    public evsw b = emptyFloatList();

    static {
        scy scyVar = new scy();
        a = scyVar;
        evsn.registerDefaultInstance(scy.class, scyVar);
    }

    private scy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new scy();
        }
        if (iOrdinal == 4) {
            return new scx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (scy.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
