package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjx extends evsn implements evui {
    public static final ejjx a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        ejjx ejjxVar = new ejjx();
        a = ejjxVar;
        evsn.registerDefaultInstance(ejjx.class, ejjxVar);
    }

    private ejjx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ejjx();
        }
        if (iOrdinal == 4) {
            return new ejjw();
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
        synchronized (ejjx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
