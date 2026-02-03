package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjy extends evsn implements evui {
    public static final eqjy a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public evtg d;

    static {
        eqjy eqjyVar = new eqjy();
        a = eqjyVar;
        evsn.registerDefaultInstance(eqjy.class, eqjyVar);
    }

    private eqjy() {
        emptyIntList();
        emptyProtobufList();
        evsn.emptyProtobufList();
        this.d = evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000f\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u000fȚ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eqjy();
        }
        if (iOrdinal == 4) {
            return new eqjw();
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
        synchronized (eqjy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
