package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class ajea extends evsn implements evui {
    public static final ajea a;
    private static volatile evuo b;

    static {
        ajea ajeaVar = new ajea();
        a = ajeaVar;
        evsn.registerDefaultInstance(ajea.class, ajeaVar);
    }

    private ajea() {
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
            return new ajea();
        }
        if (iOrdinal == 4) {
            return new ajdz();
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
        synchronized (ajea.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
