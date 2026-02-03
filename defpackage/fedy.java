package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedy extends evsn implements evui {
    public static final fedy a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public fedx f;

    static {
        fedy fedyVar = new fedy();
        a = fedyVar;
        evsn.registerDefaultInstance(fedy.class, fedyVar);
    }

    private fedy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဇ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", fedv.a, "d", enmq.a, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new fedy();
        }
        if (iOrdinal == 4) {
            return new fedu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (fedy.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
