package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpjr extends evsn implements evui {
    public static final cpjr a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        cpjr cpjrVar = new cpjr();
        a = cpjrVar;
        evsn.registerDefaultInstance(cpjr.class, cpjrVar);
    }

    private cpjr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cpjr();
        }
        if (iOrdinal == 4) {
            return new cpjq();
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
        synchronized (cpjr.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
