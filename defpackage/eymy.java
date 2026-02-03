package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eymy extends evsn implements evui {
    public static final eymy a;
    private static volatile evuo f;
    public int b;
    public ezpp c;
    public int d;
    public String e = "";

    static {
        eymy eymyVar = new eymy();
        a = eymyVar;
        evsn.registerDefaultInstance(eymy.class, eymyVar);
    }

    private eymy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0004\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eymy();
        }
        if (iOrdinal == 4) {
            return new eymx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eymy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
