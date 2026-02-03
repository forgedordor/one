package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezln extends evsn implements evui {
    public static final ezln a;
    private static volatile evuo i;
    public int b;
    public ezpr c;
    public ezns d;
    public boolean e;
    public long f;
    public ezpj g;
    public evqs h = evqs.b;

    static {
        ezln ezlnVar = new ezln();
        a = ezlnVar;
        evsn.registerDefaultInstance(ezln.class, ezlnVar);
    }

    private ezln() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0002\u0006ဉ\u0003\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ezln();
        }
        if (iOrdinal == 4) {
            return new ezlm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezln.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
