package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crzh extends evsn implements evui {
    public static final crzh a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public long d;

    static {
        crzh crzhVar = new crzh();
        a = crzhVar;
        evsn.registerDefaultInstance(crzh.class, crzhVar);
    }

    private crzh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new crzh();
        }
        if (iOrdinal == 4) {
            return new crzg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crzh.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
