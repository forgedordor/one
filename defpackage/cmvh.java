package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvh extends evsn implements evui {
    public static final cmvh a;
    private static volatile evuo g;
    public int b;
    public long c;
    public String d = "";
    public evvp e;
    public evvp f;

    static {
        cmvh cmvhVar = new cmvh();
        a = cmvhVar;
        evsn.registerDefaultInstance(cmvh.class, cmvhVar);
    }

    private cmvh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cmvh();
        }
        if (iOrdinal == 4) {
            return new cmvg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cmvh.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
