package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewyy extends evsn implements evui {
    public static final ewyy a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        ewyy ewyyVar = new ewyy();
        a = ewyyVar;
        evsn.registerDefaultInstance(ewyy.class, ewyyVar);
    }

    private ewyy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewyy();
        }
        if (iOrdinal == 4) {
            return new ewyx();
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
        synchronized (ewyy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
