package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqc extends evsn implements evui {
    public static final euqc a;
    private static volatile evuo b;

    static {
        euqc euqcVar = new euqc();
        a = euqcVar;
        evsn.registerDefaultInstance(euqc.class, euqcVar);
    }

    private euqc() {
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
            return new euqc();
        }
        if (iOrdinal == 4) {
            return new euqb();
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
        synchronized (euqc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
