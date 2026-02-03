package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrs extends evsn implements evui {
    public static final ahrs a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        ahrs ahrsVar = new ahrs();
        a = ahrsVar;
        evsn.registerDefaultInstance(ahrs.class, ahrsVar);
    }

    private ahrs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u000b\u0002\u0000\u0000\u0000\u0001\f\u000b<\u0000", new Object[]{"c", "b", "d", ahrq.class});
        }
        if (iOrdinal == 3) {
            return new ahrs();
        }
        if (iOrdinal == 4) {
            return new ahrr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ahrs.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
