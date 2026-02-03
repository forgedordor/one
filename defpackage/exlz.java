package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exlz extends evsn implements evui {
    public static final exlz a;
    private static volatile evuo g;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();
    public exjh e;
    public long f;

    static {
        exlz exlzVar = new exlz();
        a = exlzVar;
        evsn.registerDefaultInstance(exlz.class, exlzVar);
    }

    private exlz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", exjh.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exlz();
        }
        if (iOrdinal == 4) {
            return new exly();
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
        synchronized (exlz.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
