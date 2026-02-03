package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyoj extends evsn implements evui {
    public static final eyoj a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        eyoj eyojVar = new eyoj();
        a = eyojVar;
        evsn.registerDefaultInstance(eyoj.class, eyojVar);
    }

    private eyoj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eyoj();
        }
        if (iOrdinal == 4) {
            return new eyoi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyoj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
