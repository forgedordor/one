package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feii extends evsn implements evui {
    public static final feii a;
    private static volatile evuo i;
    public int b;
    public int c;
    public evvp d;
    public String e = "";
    public String f = "";
    public int g;
    public long h;

    static {
        feii feiiVar = new feii();
        a = feiiVar;
        evsn.registerDefaultInstance(feii.class, feiiVar);
    }

    private feii() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new feii();
        }
        if (iOrdinal == 4) {
            return new feih();
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
        synchronized (feii.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
