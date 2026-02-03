package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyam extends evsn implements evui {
    public static final eyam a;
    private static volatile evuo b;

    static {
        eyam eyamVar = new eyam();
        a = eyamVar;
        evsn.registerDefaultInstance(eyam.class, eyamVar);
    }

    private eyam() {
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
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eyam();
        }
        if (iOrdinal == 4) {
            return new eyal();
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
        synchronized (eyam.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
