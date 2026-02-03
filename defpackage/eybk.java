package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybk extends evsn implements evui {
    public static final eybk a;
    private static volatile evuo e;
    public String b = "";
    public long c;
    public int d;

    static {
        eybk eybkVar = new eybk();
        a = eybkVar;
        evsn.registerDefaultInstance(eybk.class, eybkVar);
    }

    private eybk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eybk();
        }
        if (iOrdinal == 4) {
            return new eybj();
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
        synchronized (eybk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
