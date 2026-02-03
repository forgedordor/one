package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eytk extends evsn implements evui {
    public static final eytk a;
    private static volatile evuo e;
    public int b;
    public eyax c;
    public float d;

    static {
        eytk eytkVar = new eytk();
        a = eytkVar;
        evsn.registerDefaultInstance(eytk.class, eytkVar);
    }

    private eytk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eytk();
        }
        if (iOrdinal == 4) {
            return new eytj();
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
        synchronized (eytk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
