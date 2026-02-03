package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiat extends evsn implements evui {
    public static final aiat a;
    private static volatile evuo b;

    static {
        aiat aiatVar = new aiat();
        a = aiatVar;
        evsn.registerDefaultInstance(aiat.class, aiatVar);
    }

    private aiat() {
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
            return new aiat();
        }
        if (iOrdinal == 4) {
            return new aias();
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
        synchronized (aiat.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
