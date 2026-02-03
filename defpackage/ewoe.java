package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewoe extends evsn implements evui {
    public static final ewoe a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public ewru h;

    static {
        ewoe ewoeVar = new ewoe();
        a = ewoeVar;
        evsn.registerDefaultInstance(ewoe.class, ewoeVar);
    }

    private ewoe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0005ဇ\u0004\u0006᠌\u0005\u0007ဉ\u0006", new Object[]{"b", "c", ewoc.a, "d", "e", ewod.a, "f", "g", ewrr.a, "h"});
        }
        if (iOrdinal == 3) {
            return new ewoe();
        }
        if (iOrdinal == 4) {
            return new ewob();
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
        synchronized (ewoe.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
