package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fehy extends evsn implements evui {
    public static final fehy a;
    private static volatile evuo e;
    public int b;
    public evtg c = evsn.emptyProtobufList();
    public fehx d;

    static {
        fehy fehyVar = new fehy();
        a = fehyVar;
        evsn.registerDefaultInstance(fehy.class, fehyVar);
    }

    private fehy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new fehy();
        }
        if (iOrdinal == 4) {
            return new fehv();
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
        synchronized (fehy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
