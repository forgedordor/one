package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyqd extends evsn implements evui {
    public static final eyqd a;
    private static volatile evuo e;
    public eypd c;
    private int f;
    public String b = "";
    public evqs d = evqs.b;

    static {
        eyqd eyqdVar = new eyqd();
        a = eyqdVar;
        evsn.registerDefaultInstance(eyqd.class, eyqdVar);
    }

    private eyqd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\n", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eyqd();
        }
        if (iOrdinal == 4) {
            return new eyqc();
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
        synchronized (eyqd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
