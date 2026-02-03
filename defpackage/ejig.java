package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejig extends evsn implements evui {
    public static final ejig a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public int d;
    public double e;

    static {
        ejig ejigVar = new ejig();
        a = ejigVar;
        evsn.registerDefaultInstance(ejig.class, ejigVar);
    }

    private ejig() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003က\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ejig();
        }
        if (iOrdinal == 4) {
            return new ejif();
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
        synchronized (ejig.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
