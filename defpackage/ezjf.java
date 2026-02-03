package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjf extends evsn implements evui {
    public static final ezjf a;
    private static volatile evuo d;
    public String b = "";
    public int c;

    static {
        ezjf ezjfVar = new ezjf();
        a = ezjfVar;
        evsn.registerDefaultInstance(ezjf.class, ezjfVar);
    }

    private ezjf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezjf();
        }
        if (iOrdinal == 4) {
            return new ezje();
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
        synchronized (ezjf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
