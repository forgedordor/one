package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cirm extends evsn implements evui {
    public static final cirm a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        cirm cirmVar = new cirm();
        a = cirmVar;
        evsn.registerDefaultInstance(cirm.class, cirmVar);
    }

    private cirm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cirm();
        }
        if (iOrdinal == 4) {
            return new cirl();
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
        synchronized (cirm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
