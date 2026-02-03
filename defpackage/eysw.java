package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eysw extends evsn implements evui {
    public static final eysw a;
    private static volatile evuo c;
    public eypy b;
    private int d;

    static {
        eysw eyswVar = new eysw();
        a = eyswVar;
        evsn.registerDefaultInstance(eysw.class, eyswVar);
    }

    private eysw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eysw();
        }
        if (iOrdinal == 4) {
            return new eysv();
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
        synchronized (eysw.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
