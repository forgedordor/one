package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupw extends evsn implements evui {
    public static final eupw a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eupw eupwVar = new eupw();
        a = eupwVar;
        evsn.registerDefaultInstance(eupw.class, eupwVar);
    }

    private eupw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", euqg.class});
        }
        if (iOrdinal == 3) {
            return new eupw();
        }
        if (iOrdinal == 4) {
            return new eupv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eupw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
