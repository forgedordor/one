package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswh extends evsn implements evui {
    public static final dswh a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        dswh dswhVar = new dswh();
        a = dswhVar;
        evsn.registerDefaultInstance(dswh.class, dswhVar);
    }

    private dswh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", dswf.a});
        }
        if (iOrdinal == 3) {
            return new dswh();
        }
        if (iOrdinal == 4) {
            return new dswe();
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
        synchronized (dswh.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
