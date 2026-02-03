package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtae extends evsn implements evui {
    public static final dtae a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public boolean d;

    static {
        dtae dtaeVar = new dtae();
        a = dtaeVar;
        evsn.registerDefaultInstance(dtae.class, dtaeVar);
    }

    private dtae() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dtae();
        }
        if (iOrdinal == 4) {
            return new dtad();
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
        synchronized (dtae.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
