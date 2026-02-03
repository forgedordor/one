package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokf extends evsn implements evui {
    public static final dokf a;
    private static volatile evuo b;

    static {
        dokf dokfVar = new dokf();
        a = dokfVar;
        evsn.registerDefaultInstance(dokf.class, dokfVar);
    }

    private dokf() {
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
            return new dokf();
        }
        if (iOrdinal == 4) {
            return new doke();
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
        synchronized (dokf.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
