package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exau extends evsn implements evui {
    public static final exau a;
    private static volatile evuo b;

    static {
        exau exauVar = new exau();
        a = exauVar;
        evsn.registerDefaultInstance(exau.class, exauVar);
    }

    private exau() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new exau();
        }
        if (iOrdinal == 4) {
            return new exat();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exau.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
