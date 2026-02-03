package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzn extends evsn implements evui {
    public static final emzn a;
    private static volatile evuo k;
    public int b;
    public long c;
    public evtg d = emptyProtobufList();
    public int e;
    public int f;
    public engg g;
    public engu h;
    public emvw i;
    public enga j;

    static {
        emzn emznVar = new emzn();
        a = emznVar;
        evsn.registerDefaultInstance(emzn.class, emznVar);
    }

    private emzn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003᠌\u0001\u0004င\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"b", "c", "d", emop.class, "e", emzq.a, "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new emzn();
        }
        if (iOrdinal == 4) {
            return new emzm();
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
        synchronized (emzn.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
