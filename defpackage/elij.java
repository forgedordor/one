package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elij extends evsn implements evui {
    public static final elij a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public elql f;
    public elmr g;
    public String h = "";

    static {
        elij elijVar = new elij();
        a = elijVar;
        evsn.registerDefaultInstance(elij.class, elijVar);
    }

    private elij() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0007ဈ\u0006", new Object[]{"b", "c", eyzx.a, "d", elii.a, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new elij();
        }
        if (iOrdinal == 4) {
            return new elih();
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
        synchronized (elij.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
