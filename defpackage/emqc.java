package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqc extends evsn implements evui {
    public static final emqc a;
    private static volatile evuo b;

    static {
        emqc emqcVar = new emqc();
        a = emqcVar;
        evsn.registerDefaultInstance(emqc.class, emqcVar);
    }

    private emqc() {
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
            return new emqc();
        }
        if (iOrdinal == 4) {
            return new emqb();
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
        synchronized (emqc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
