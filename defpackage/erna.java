package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class erna extends evsn implements evui {
    public static final erna a;
    private static volatile evuo b;

    static {
        erna ernaVar = new erna();
        a = ernaVar;
        evsn.registerDefaultInstance(erna.class, ernaVar);
    }

    private erna() {
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
            return new erna();
        }
        if (iOrdinal == 4) {
            return new ermz();
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
        synchronized (erna.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
