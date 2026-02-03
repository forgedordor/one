package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class emrx extends evsn implements evui {
    public static final emrx a;
    private static volatile evuo b;

    static {
        emrx emrxVar = new emrx();
        a = emrxVar;
        evsn.registerDefaultInstance(emrx.class, emrxVar);
    }

    private emrx() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
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
            return new emrx();
        }
        if (iOrdinal == 4) {
            return new emrw();
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
        synchronized (emrx.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
