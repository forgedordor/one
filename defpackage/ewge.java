package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ewge extends evsn implements evui {
    public static final ewge a;
    private static volatile evuo b;

    static {
        ewge ewgeVar = new ewge();
        a = ewgeVar;
        evsn.registerDefaultInstance(ewge.class, ewgeVar);
    }

    private ewge() {
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
            return new ewge();
        }
        if (iOrdinal == 4) {
            return new ewgd();
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
        synchronized (ewge.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
