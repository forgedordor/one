package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exqz extends evsn implements evui {
    public static final exqz a;
    private static volatile evuo e;
    public int b;
    public exnl c;
    public int d;

    static {
        exqz exqzVar = new exqz();
        a = exqzVar;
        evsn.registerDefaultInstance(exqz.class, exqzVar);
    }

    private exqz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exqz();
        }
        if (iOrdinal == 4) {
            return new exqx();
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
        synchronized (exqz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
