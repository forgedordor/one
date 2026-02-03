package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvs extends evsn implements evui {
    public static final emvs a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public evtg g = emptyProtobufList();
    public evtg h = emptyProtobufList();
    public evtg i = emptyProtobufList();
    public evtg j = emptyProtobufList();

    static {
        emvs emvsVar = new emvs();
        a = emvsVar;
        evsn.registerDefaultInstance(emvs.class, emvsVar);
    }

    private emvs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"b", "c", "d", "e", "f", "g", emvq.class, "h", emvq.class, "i", emvq.class, "j", emuu.class});
        }
        if (iOrdinal == 3) {
            return new emvs();
        }
        if (iOrdinal == 4) {
            return new emvr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emvs.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
