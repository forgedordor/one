package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqs extends evsn implements evui {
    public static final euqs a;
    private static volatile evuo h;
    public int b;
    public int c = 1;
    public eurm d;
    public eurk e;
    public euqv f;
    public eura g;

    static {
        euqs euqsVar = new euqs();
        a = euqsVar;
        evsn.registerDefaultInstance(euqs.class, euqsVar);
    }

    private euqs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0001", new Object[]{"b", "c", euqy.a, "e", "f", "g", "d"});
        }
        if (iOrdinal == 3) {
            return new euqs();
        }
        if (iOrdinal == 4) {
            return new euqr();
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
        synchronized (euqs.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
