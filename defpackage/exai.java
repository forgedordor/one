package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exai extends evsn implements evui {
    public static final exai a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        exai exaiVar = new exai();
        a = exaiVar;
        evsn.registerDefaultInstance(exai.class, exaiVar);
    }

    private exai() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exai();
        }
        if (iOrdinal == 4) {
            return new exah();
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
        synchronized (exai.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
