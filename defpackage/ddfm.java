package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddfm extends evsn implements evui {
    public static final ddfm a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        ddfm ddfmVar = new ddfm();
        a = ddfmVar;
        evsn.registerDefaultInstance(ddfm.class, ddfmVar);
    }

    private ddfm() {
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
            return new ddfm();
        }
        if (iOrdinal == 4) {
            return new ddfl();
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
        synchronized (ddfm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
