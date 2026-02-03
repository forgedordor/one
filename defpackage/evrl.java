package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrl extends evsn implements evui {
    public static final evrl a;
    private static volatile evuo b;

    static {
        evrl evrlVar = new evrl();
        a = evrlVar;
        evsn.registerDefaultInstance(evrl.class, evrlVar);
    }

    private evrl() {
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
            return new evrl();
        }
        if (iOrdinal == 4) {
            return new evrk();
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
        synchronized (evrl.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
