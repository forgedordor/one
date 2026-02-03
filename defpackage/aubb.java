package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubb extends evsn implements evui {
    public static final aubb a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public evtg d = evsn.emptyProtobufList();
    public String e = "";
    public auib f;
    public long g;

    static {
        aubb aubbVar = new aubb();
        a = aubbVar;
        evsn.registerDefaultInstance(aubb.class, aubbVar);
    }

    private aubb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0004ဈ\u0001\u0005ဉ\u0002\u0006ဂ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aubb();
        }
        if (iOrdinal == 4) {
            return new auba();
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
        synchronized (aubb.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
