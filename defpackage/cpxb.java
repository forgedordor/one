package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpxb extends evsn implements evui {
    public static final cpxb a;
    private static volatile evuo f;
    public String b = "";
    public long c;
    public long d;
    public long e;

    static {
        cpxb cpxbVar = new cpxb();
        a = cpxbVar;
        evsn.registerDefaultInstance(cpxb.class, cpxbVar);
    }

    private cpxb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cpxb();
        }
        if (iOrdinal == 4) {
            return new cpxa();
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
        synchronized (cpxb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
