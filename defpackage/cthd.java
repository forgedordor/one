package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthd extends evsn implements evui {
    public static final cthd a;
    private static volatile evuo c;
    public long b;

    static {
        cthd cthdVar = new cthd();
        a = cthdVar;
        evsn.registerDefaultInstance(cthd.class, cthdVar);
    }

    private cthd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new cthd();
        }
        if (iOrdinal == 4) {
            return new cthc();
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
        synchronized (cthd.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
