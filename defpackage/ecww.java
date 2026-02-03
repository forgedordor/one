package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecww extends evsn implements evui {
    public static final ecww a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public int d;

    static {
        ecww ecwwVar = new ecww();
        a = ecwwVar;
        evsn.registerDefaultInstance(ecww.class, ecwwVar);
    }

    private ecww() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ecww();
        }
        if (iOrdinal == 4) {
            return new ecwv();
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
        synchronized (ecww.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
