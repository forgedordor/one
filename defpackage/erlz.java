package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erlz extends evsn implements evui {
    public static final erlz a;
    private static volatile evuo f;
    public int b;
    public int c;
    public ermb d;
    public evqs e = evqs.b;

    static {
        erlz erlzVar = new erlz();
        a = erlzVar;
        evsn.registerDefaultInstance(erlz.class, erlzVar);
    }

    private erlz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new erlz();
        }
        if (iOrdinal == 4) {
            return new erly();
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
        synchronized (erlz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
