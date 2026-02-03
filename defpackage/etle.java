package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etle extends evsn implements evui {
    public static final etle a;
    private static volatile evuo b;

    static {
        etle etleVar = new etle();
        a = etleVar;
        evsn.registerDefaultInstance(etle.class, etleVar);
    }

    private etle() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new etle();
        }
        if (iOrdinal == 4) {
            return new etld();
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
        synchronized (etle.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
