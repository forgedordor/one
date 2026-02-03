package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyoa extends evsn implements evui {
    public static final eyoa a;
    private static volatile evuo d;
    public int b;
    public evqe c;
    private int e;

    static {
        eyoa eyoaVar = new eyoa();
        a = eyoaVar;
        evsn.registerDefaultInstance(eyoa.class, eyoaVar);
    }

    private eyoa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eyoa();
        }
        if (iOrdinal == 4) {
            return new eynz();
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
        synchronized (eyoa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
