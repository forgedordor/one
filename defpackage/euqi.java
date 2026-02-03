package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqi extends evsn implements evui {
    public static final euqi a;
    private static volatile evuo b;

    static {
        euqi euqiVar = new euqi();
        a = euqiVar;
        evsn.registerDefaultInstance(euqi.class, euqiVar);
    }

    private euqi() {
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
            return new euqi();
        }
        if (iOrdinal == 4) {
            return new euqh();
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
        synchronized (euqi.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
