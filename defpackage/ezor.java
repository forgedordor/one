package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezor extends evsn implements evui {
    public static final ezor a;
    private static volatile evuo d;
    public long b;
    public String c = "";

    static {
        ezor ezorVar = new ezor();
        a = ezorVar;
        evsn.registerDefaultInstance(ezor.class, ezorVar);
    }

    private ezor() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezor();
        }
        if (iOrdinal == 4) {
            return new ezoq();
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
        synchronized (ezor.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
