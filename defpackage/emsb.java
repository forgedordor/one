package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsb extends evsn implements evui {
    public static final emsb a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        emsb emsbVar = new emsb();
        a = emsbVar;
        evsn.registerDefaultInstance(emsb.class, emsbVar);
    }

    private emsb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emsa.a;
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", emry.a, "f", emrm.a, "g", emrp.a});
        }
        if (iOrdinal == 3) {
            return new emsb();
        }
        if (iOrdinal == 4) {
            return new emrz();
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
        synchronized (emsb.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
