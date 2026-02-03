package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawv extends evsn implements evui {
    public static final cawv a;
    private static volatile evuo e;
    public String b = "";
    public int c;
    public long d;

    static {
        cawv cawvVar = new cawv();
        a = cawvVar;
        evsn.registerDefaultInstance(cawv.class, cawvVar);
    }

    private cawv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cawv();
        }
        if (iOrdinal == 4) {
            return new cawu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cawv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
