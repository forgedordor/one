package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsm extends evsn implements evui {
    public static final emsm a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public Object f;
    public emss g;
    public int h;
    public int i;
    public int c = 0;
    public int e = 0;

    static {
        emsm emsmVar = new emsm();
        a = emsmVar;
        evsn.registerDefaultInstance(emsm.class, emsmVar);
    }

    private emsm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001É\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002e\u083f\u0000f\u083f\u0000É\u083f\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", emsi.a, emsg.a, emsk.a});
        }
        if (iOrdinal == 3) {
            return new emsm();
        }
        if (iOrdinal == 4) {
            return new emsf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emsm.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
