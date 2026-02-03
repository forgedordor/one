package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eocr extends evsn implements evui {
    public static final eocr a;
    private static volatile evuo h;
    public int b;
    public long c;
    public int d;
    public evsx e = emptyIntList();
    public long f;
    public long g;

    static {
        eocr eocrVar = new eocr();
        a = eocrVar;
        evsn.registerDefaultInstance(eocr.class, eocrVar);
    }

    private eocr() {
    }

    public final void a() {
        evsx evsxVar = this.e;
        if (evsxVar.c()) {
            return;
        }
        this.e = evsn.mutableCopy(evsxVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003,\u0004ဂ\u0002\u0005ဂ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eocr();
        }
        if (iOrdinal == 4) {
            return new eoco();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eocr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
