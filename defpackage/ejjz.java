package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjz extends evsn implements evui {
    public static final ejjz a;
    private static volatile evuo e;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    private int f;

    static {
        ejjz ejjzVar = new ejjz();
        a = ejjzVar;
        evsn.registerDefaultInstance(ejjz.class, ejjzVar);
    }

    private ejjz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejjz();
        }
        if (iOrdinal == 4) {
            return new ejjy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejjz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
