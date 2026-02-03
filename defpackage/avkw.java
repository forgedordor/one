package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkw extends evsn implements evui {
    public static final avkw a;
    private static volatile evuo g;
    public int b;
    public evtg c = emptyProtobufList();
    public int d;
    public int e;
    public int f;

    static {
        avkw avkwVar = new avkw();
        a = avkwVar;
        evsn.registerDefaultInstance(avkw.class, avkwVar);
    }

    private avkw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0005ဌ\u0002", new Object[]{"b", "c", avlk.class, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new avkw();
        }
        if (iOrdinal == 4) {
            return new avkv();
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
        synchronized (avkw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
