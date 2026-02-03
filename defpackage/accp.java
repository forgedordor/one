package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accp extends evsn implements evui {
    public static final accp a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        accp accpVar = new accp();
        a = accpVar;
        evsn.registerDefaultInstance(accp.class, accpVar);
    }

    private accp() {
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
            return new accp();
        }
        if (iOrdinal == 4) {
            return new acco();
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
        synchronized (accp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
