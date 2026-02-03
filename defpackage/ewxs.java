package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewxs extends evsn implements evui {
    public static final ewxs a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public int d;
    public elho e;

    static {
        ewxs ewxsVar = new ewxs();
        a = ewxsVar;
        evsn.registerDefaultInstance(ewxs.class, ewxsVar);
    }

    private ewxs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ewxs();
        }
        if (iOrdinal == 4) {
            return new ewxr();
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
        synchronized (ewxs.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
