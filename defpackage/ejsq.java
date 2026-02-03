package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsq extends evsn implements evui {
    public static final ejsq a;
    private static volatile evuo b;

    static {
        ejsq ejsqVar = new ejsq();
        a = ejsqVar;
        evsn.registerDefaultInstance(ejsq.class, ejsqVar);
    }

    private ejsq() {
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
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ejsq();
        }
        if (iOrdinal == 4) {
            return new ejsp();
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
        synchronized (ejsq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
