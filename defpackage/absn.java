package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absn extends evsn implements evui {
    public static final absn a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        absn absnVar = new absn();
        a = absnVar;
        evsn.registerDefaultInstance(absn.class, absnVar);
    }

    private absn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new absn();
        }
        if (iOrdinal == 4) {
            return new absm();
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
        synchronized (absn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
