package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exao extends evsn implements evui {
    public static final exao a;
    private static volatile evuo b;

    static {
        exao exaoVar = new exao();
        a = exaoVar;
        evsn.registerDefaultInstance(exao.class, exaoVar);
    }

    private exao() {
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
            return new exao();
        }
        if (iOrdinal == 4) {
            return new exan();
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
        synchronized (exao.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
