package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewgv extends evsn implements evui {
    public static final ewgv a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ewgv ewgvVar = new ewgv();
        a = ewgvVar;
        evsn.registerDefaultInstance(ewgv.class, ewgvVar);
    }

    private ewgv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", ewgr.a, "d", ewgu.a, "e", ewgs.a});
        }
        if (iOrdinal == 3) {
            return new ewgv();
        }
        if (iOrdinal == 4) {
            return new ewgq();
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
        synchronized (ewgv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
