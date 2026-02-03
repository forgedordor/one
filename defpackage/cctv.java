package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cctv extends evsn implements evui {
    public static final cctv a;
    private static volatile evuo i;
    public int b;
    public ccps c;
    public evqs d;
    public evqs e;
    public String f;
    public evvp g;
    public String h;

    static {
        cctv cctvVar = new cctv();
        a = cctvVar;
        evsn.registerDefaultInstance(cctv.class, cctvVar);
    }

    private cctv() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = evqsVar;
        this.f = "";
        this.h = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003\n\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cctv();
        }
        if (iOrdinal == 4) {
            return new cctu();
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
        synchronized (cctv.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
