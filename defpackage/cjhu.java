package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjhu extends evsn implements evui {
    public static final cjhu a;
    private static volatile evuo i;
    public int b;
    public cjme e;
    public cjhq g;
    public cjlk h;
    public String c = "";
    public String d = "";
    public evtg f = emptyProtobufList();

    static {
        cjhu cjhuVar = new cjhu();
        a = cjhuVar;
        evsn.registerDefaultInstance(cjhu.class, cjhuVar);
    }

    private cjhu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", cjhy.class, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cjhu();
        }
        if (iOrdinal == 4) {
            return new cjht();
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
        synchronized (cjhu.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
