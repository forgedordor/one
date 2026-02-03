package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exda extends evsn implements evui {
    public static final exda a;
    private static volatile evuo d;
    public int b;
    public excy c;

    static {
        exda exdaVar = new exda();
        a = exdaVar;
        evsn.registerDefaultInstance(exda.class, exdaVar);
    }

    private exda() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new exda();
        }
        if (iOrdinal == 4) {
            return new excz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exda.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
