package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auht extends evsn implements evui {
    public static final auht a;
    private static volatile evuo b;

    static {
        auht auhtVar = new auht();
        a = auhtVar;
        evsn.registerDefaultInstance(auht.class, auhtVar);
    }

    private auht() {
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
            return new auht();
        }
        if (iOrdinal == 4) {
            return new auhs();
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
        synchronized (auht.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
