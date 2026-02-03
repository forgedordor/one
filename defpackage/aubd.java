package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubd extends evsn implements evui {
    public static final aubd a;
    private static volatile evuo h;
    public int b;
    public audu c;
    public evtg d = emptyProtobufList();
    public evqs e = evqs.b;
    public aubq f;
    public auib g;

    static {
        aubd aubdVar = new aubd();
        a = aubdVar;
        evsn.registerDefaultInstance(aubd.class, aubdVar);
    }

    private aubd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", aubq.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aubd();
        }
        if (iOrdinal == 4) {
            return new aubc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aubd.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
