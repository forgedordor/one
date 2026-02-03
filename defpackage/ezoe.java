package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezoe extends evsn implements evui {
    public static final ezoe a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h = "";

    static {
        ezoe ezoeVar = new ezoe();
        a = ezoeVar;
        evsn.registerDefaultInstance(ezoe.class, ezoeVar);
    }

    private ezoe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0000\u0003\n\u0007\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\b\f\t\f\nȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ezoe();
        }
        if (iOrdinal == 4) {
            return new ezod();
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
        synchronized (ezoe.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
