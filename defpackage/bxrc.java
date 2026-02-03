package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrc extends evsn implements evui {
    public static final bxrc a;
    private static volatile evuo b;

    static {
        bxrc bxrcVar = new bxrc();
        a = bxrcVar;
        evsn.registerDefaultInstance(bxrc.class, bxrcVar);
    }

    private bxrc() {
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
            return new bxrc();
        }
        if (iOrdinal == 4) {
            return new bxrb();
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
        synchronized (bxrc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
