package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eztm extends evsn implements evui {
    public static final eztm a;
    private static volatile evuo f;
    public int b;
    public int c;
    public String d = "";
    public evyk e;

    static {
        eztm eztmVar = new eztm();
        a = eztmVar;
        evsn.registerDefaultInstance(eztm.class, eztmVar);
    }

    private eztm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\f\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eztm();
        }
        if (iOrdinal == 4) {
            return new eztl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eztm.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
