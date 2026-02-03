package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erle extends evsn implements evui {
    public static final erle a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evqs d = evqs.b;
    public erlg e;

    static {
        erle erleVar = new erle();
        a = erleVar;
        evsn.registerDefaultInstance(erle.class, erleVar);
    }

    private erle() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new erle();
        }
        if (iOrdinal == 4) {
            return new erld();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (erle.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
