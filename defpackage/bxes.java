package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxes extends evsn implements evui {
    public static final bxes a;
    private static volatile evuo b;

    static {
        bxes bxesVar = new bxes();
        a = bxesVar;
        evsn.registerDefaultInstance(bxes.class, bxesVar);
    }

    private bxes() {
        emptyProtobufList();
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
            return new bxes();
        }
        if (iOrdinal == 4) {
            return new bxer();
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
        synchronized (bxes.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
