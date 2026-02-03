package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypv extends evsn implements evui {
    public static final eypv a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        eypv eypvVar = new eypv();
        a = eypvVar;
        evsn.registerDefaultInstance(eypv.class, eypvVar);
    }

    private eypv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001=\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"c", "b", "d"});
        }
        if (iOrdinal == 3) {
            return new eypv();
        }
        if (iOrdinal == 4) {
            return new eypu();
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
        synchronized (eypv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
