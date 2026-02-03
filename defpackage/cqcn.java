package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqcn extends evsn implements evui {
    public static final cqcn a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        cqcn cqcnVar = new cqcn();
        a = cqcnVar;
        evsn.registerDefaultInstance(cqcn.class, cqcnVar);
    }

    private cqcn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new cqcn();
        }
        if (iOrdinal == 4) {
            return new cqcm();
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
        synchronized (cqcn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
