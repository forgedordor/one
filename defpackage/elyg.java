package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elyg extends evsn implements evui {
    public static final elyg a;
    private static volatile evuo i;
    public int b;
    public int c;
    public boolean f;
    public int g;
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();
    public String h = "";

    static {
        elyg elygVar = new elyg();
        a = elygVar;
        evsn.registerDefaultInstance(elyg.class, elygVar);
    }

    private elyg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005င\u0002\u0006ဈ\u0003", new Object[]{"b", "c", elyc.a, "d", elyf.class, "e", elyf.class, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new elyg();
        }
        if (iOrdinal == 4) {
            return new elyb();
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
        synchronized (elyg.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
