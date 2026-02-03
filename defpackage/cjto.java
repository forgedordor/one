package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjto extends evsn implements evui {
    public static final cjto a;
    private static volatile evuo e;
    public int b;
    public evvp c;
    public String d = "";

    static {
        cjto cjtoVar = new cjto();
        a = cjtoVar;
        evsn.registerDefaultInstance(cjto.class, cjtoVar);
    }

    private cjto() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cjto();
        }
        if (iOrdinal == 4) {
            return new cjtn();
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
        synchronized (cjto.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
