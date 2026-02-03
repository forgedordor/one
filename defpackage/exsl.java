package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exsl extends evsn implements evui {
    public static final exsl a;
    private static volatile evuo b;

    static {
        exsl exslVar = new exsl();
        a = exslVar;
        evsn.registerDefaultInstance(exsl.class, exslVar);
    }

    private exsl() {
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
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new exsl();
        }
        if (iOrdinal == 4) {
            return new exsk();
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
        synchronized (exsl.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
