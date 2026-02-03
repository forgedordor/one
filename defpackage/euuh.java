package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuh extends evsn implements evui {
    public static final euuh a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public eybi d;
    public eybi e;
    public double f;
    public eusd g;
    public evvp h;

    static {
        euuh euuhVar = new euuh();
        a = euuhVar;
        evsn.registerDefaultInstance(euuh.class, euuhVar);
    }

    private euuh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0002\u000e\u0006\u0000\u0000\u0000\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003", new Object[]{"b", "c", "f", "d", "e", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new euuh();
        }
        if (iOrdinal == 4) {
            return new euug();
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
        synchronized (euuh.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
