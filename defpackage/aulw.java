package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aulw extends evsn implements evui {
    public static final aulw a;
    private static volatile evuo b;

    static {
        aulw aulwVar = new aulw();
        a = aulwVar;
        evsn.registerDefaultInstance(aulw.class, aulwVar);
    }

    private aulw() {
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
            return new aulw();
        }
        if (iOrdinal == 4) {
            return new aulv();
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
        synchronized (aulw.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
