package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezfv extends evsn implements evui {
    public static final ezfv a;
    private static volatile evuo h;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public long f;
    public int g;

    static {
        ezfv ezfvVar = new ezfv();
        a = ezfvVar;
        evsn.registerDefaultInstance(ezfv.class, ezfvVar);
    }

    private ezfv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0002\u0006\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezfv();
        }
        if (iOrdinal == 4) {
            return new ezfu();
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
        synchronized (ezfv.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
