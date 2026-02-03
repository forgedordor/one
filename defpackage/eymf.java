package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eymf extends evsn implements evui {
    public static final eymf a;
    private static volatile evuo d;
    public boolean b;
    public String c = "";

    static {
        eymf eymfVar = new eymf();
        a = eymfVar;
        evsn.registerDefaultInstance(eymf.class, eymfVar);
    }

    private eymf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u0007\u0004Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eymf();
        }
        if (iOrdinal == 4) {
            return new eyme();
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
        synchronized (eymf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
