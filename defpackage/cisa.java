package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisa extends evsn implements evui {
    public static final cisa a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public evtg f = emptyProtobufList();
    public cish g;
    public long h;

    static {
        cisa cisaVar = new cisa();
        a = cisaVar;
        evsn.registerDefaultInstance(cisa.class, cisaVar);
    }

    private cisa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", cirm.class, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cisa();
        }
        if (iOrdinal == 4) {
            return new cirz();
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
        synchronized (cisa.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
