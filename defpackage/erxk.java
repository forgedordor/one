package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxk extends evsn implements evui {
    public static final erxk a;
    private static volatile evuo b;

    static {
        erxk erxkVar = new erxk();
        a = erxkVar;
        evsn.registerDefaultInstance(erxk.class, erxkVar);
    }

    private erxk() {
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
            return new erxk();
        }
        if (iOrdinal == 4) {
            return new erxj();
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
        synchronized (erxk.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
