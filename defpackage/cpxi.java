package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpxi extends evsn implements evui {
    public static final cpxi a;
    private static volatile evuo f;
    public int b;
    public evvp c;
    public String d = "";
    public evvp e;

    static {
        cpxi cpxiVar = new cpxi();
        a = cpxiVar;
        evsn.registerDefaultInstance(cpxi.class, cpxiVar);
    }

    private cpxi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cpxi();
        }
        if (iOrdinal == 4) {
            return new cpxh();
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
        synchronized (cpxi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
