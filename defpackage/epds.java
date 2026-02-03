package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epds extends evsn implements evui {
    public static final epds a;
    private static volatile evuo i;
    public int b;
    public epbl d;
    public epes e;
    public boolean g;
    public epdi h;
    public String c = "";
    public String f = "";

    static {
        epds epdsVar = new epds();
        a = epdsVar;
        evsn.registerDefaultInstance(epds.class, epdsVar);
    }

    private epds() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006\u0007\bဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new epds();
        }
        if (iOrdinal == 4) {
            return new epdr();
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
        synchronized (epds.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
