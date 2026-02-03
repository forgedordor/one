package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eykw extends evsn implements evui {
    public static final eykw a;
    private static volatile evuo b;

    static {
        eykw eykwVar = new eykw();
        a = eykwVar;
        evsn.registerDefaultInstance(eykw.class, eykwVar);
    }

    private eykw() {
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
            return new eykw();
        }
        if (iOrdinal == 4) {
            return new eykv();
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
        synchronized (eykw.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
