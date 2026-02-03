package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdg extends evsn implements evui {
    public static final exdg a;
    private static volatile evuo b;

    static {
        exdg exdgVar = new exdg();
        a = exdgVar;
        evsn.registerDefaultInstance(exdg.class, exdgVar);
    }

    private exdg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new exdg();
        }
        if (iOrdinal == 4) {
            return new exdf();
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
        synchronized (exdg.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
