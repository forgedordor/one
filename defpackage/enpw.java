package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpw extends evsn implements evui {
    public static final enpw a;
    private static volatile evuo b;

    static {
        enpw enpwVar = new enpw();
        a = enpwVar;
        evsn.registerDefaultInstance(enpw.class, enpwVar);
    }

    private enpw() {
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
            return new enpw();
        }
        if (iOrdinal == 4) {
            return new enpv();
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
        synchronized (enpw.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
