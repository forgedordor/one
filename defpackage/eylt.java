package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class eylt extends evsn implements evui {
    public static final eylt a;
    private static volatile evuo c;
    public int b;

    static {
        eylt eyltVar = new eylt();
        a = eyltVar;
        evsn.registerDefaultInstance(eylt.class, eyltVar);
    }

    private eylt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u0004", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eylt();
        }
        if (iOrdinal == 4) {
            return new eyls();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eylt.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
