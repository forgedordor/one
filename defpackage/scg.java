package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scg extends evsn implements evui {
    public static final scg a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;
    public sbw h;

    static {
        scg scgVar = new scg();
        a = scgVar;
        evsn.registerDefaultInstance(scg.class, scgVar);
    }

    private scg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005", new Object[]{"b", "c", scc.a, "d", sce.a, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new scg();
        }
        if (iOrdinal == 4) {
            return new scb();
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
        synchronized (scg.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
