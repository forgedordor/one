package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewfm extends evsn implements evui {
    public static final ewfm a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public ewcy h;

    static {
        ewfm ewfmVar = new ewfm();
        a = ewfmVar;
        evsn.registerDefaultInstance(ewfm.class, ewfmVar);
    }

    private ewfm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0006᠌\u0004\u0007᠌\u0005\t᠌\u0007\n᠌\b\u0010ဉ\u000e", new Object[]{"b", "c", "d", ewro.a, "e", ewrr.a, "f", ewrq.a, "g", enwq.a, "h"});
        }
        if (iOrdinal == 3) {
            return new ewfm();
        }
        if (iOrdinal == 4) {
            return new ewfl();
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
        synchronized (ewfm.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
