package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etst extends evsn implements evui {
    public static final etst a;
    private static volatile evuo b;

    static {
        etst etstVar = new etst();
        a = etstVar;
        evsn.registerDefaultInstance(etst.class, etstVar);
    }

    private etst() {
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
            return new etst();
        }
        if (iOrdinal == 4) {
            return new etss();
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
        synchronized (etst.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
