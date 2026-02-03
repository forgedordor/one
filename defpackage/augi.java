package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augi extends evsn implements evui {
    public static final augi a;
    private static volatile evuo h;
    public int b;
    public audu c;
    public evtg d = emptyProtobufList();
    public evqs e = evqs.b;
    public aubq f;
    public auib g;

    static {
        augi augiVar = new augi();
        a = augiVar;
        evsn.registerDefaultInstance(augi.class, augiVar);
    }

    private augi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002\nဉ\u0003", new Object[]{"b", "c", "d", aubq.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new augi();
        }
        if (iOrdinal == 4) {
            return new augh();
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
        synchronized (augi.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
