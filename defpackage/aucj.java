package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucj extends evsn implements evui {
    public static final aucj a;
    private static volatile evuo i;
    public int b;
    public int d;
    public aubx e;
    public evvp g;
    public String c = "";
    public String f = "";
    public evqs h = evqs.b;

    static {
        aucj aucjVar = new aucj();
        a = aucjVar;
        evsn.registerDefaultInstance(aucj.class, aucjVar);
    }

    private aucj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0007ည\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aucj();
        }
        if (iOrdinal == 4) {
            return new auci();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aucj.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
