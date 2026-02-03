package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emes extends evsn implements evui {
    public static final emes a;
    private static volatile evuo e;
    public int b;
    public long c;
    public int d;

    static {
        emes emesVar = new emes();
        a = emesVar;
        evsn.registerDefaultInstance(emes.class, emesVar);
    }

    private emes() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ewhw.a});
        }
        if (iOrdinal == 3) {
            return new emes();
        }
        if (iOrdinal == 4) {
            return new emer();
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
        synchronized (emes.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
