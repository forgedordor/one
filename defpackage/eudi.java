package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudi extends evsn implements evui {
    public static final eudi a;
    private static volatile evuo h;
    public int b;
    public int c;
    public evqs d = evqs.b;
    public eudc e;
    public efvt f;
    public int g;

    static {
        eudi eudiVar = new eudi();
        a = eudiVar;
        evsn.registerDefaultInstance(eudi.class, eudiVar);
    }

    private eudi() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\r\u0005\u0000\u0000\u0000\u0001\f\u0003\f\u0005\n\bဉ\u0002\rဉ\u0000", new Object[]{"b", "c", "g", "d", "f", "e"});
        }
        if (iOrdinal == 3) {
            return new eudi();
        }
        if (iOrdinal == 4) {
            return new eudh();
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
        synchronized (eudi.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
