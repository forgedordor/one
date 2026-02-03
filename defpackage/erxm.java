package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxm extends evsn implements evui {
    public static final erxm a;
    private static volatile evuo b;

    static {
        erxm erxmVar = new erxm();
        a = erxmVar;
        evsn.registerDefaultInstance(erxm.class, erxmVar);
    }

    private erxm() {
        emptyIntList();
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
            return new erxm();
        }
        if (iOrdinal == 4) {
            return new erxl();
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
        synchronized (erxm.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
