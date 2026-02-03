package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddez extends evsn implements evui {
    public static final ddez a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        ddez ddezVar = new ddez();
        a = ddezVar;
        evsn.registerDefaultInstance(ddez.class, ddezVar);
    }

    private ddez() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ddex.a});
        }
        if (iOrdinal == 3) {
            return new ddez();
        }
        if (iOrdinal == 4) {
            return new ddey();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ddez.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
