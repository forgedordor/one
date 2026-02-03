package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exqf extends evsn implements evui {
    public static final exqf a;
    private static volatile evuo d;
    public evsx b = emptyIntList();
    public exno c;
    private int e;

    static {
        exqf exqfVar = new exqf();
        a = exqfVar;
        evsn.registerDefaultInstance(exqf.class, exqfVar);
    }

    private exqf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new exqf();
        }
        if (iOrdinal == 4) {
            return new exqe();
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
        synchronized (exqf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
