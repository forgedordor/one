package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyy extends evsn implements evui {
    public static final doyy a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public doaz e;

    static {
        doyy doyyVar = new doyy();
        a = doyyVar;
        evsn.registerDefaultInstance(doyy.class, doyyVar);
    }

    private doyy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0001dÈ\u0002\u0000\u0000\u0000dဉ\u0000È<\u0000", new Object[]{"d", "c", "b", "e", doyx.class});
        }
        if (iOrdinal == 3) {
            return new doyy();
        }
        if (iOrdinal == 4) {
            return new doyv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (doyy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
