package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxc extends evsn implements evui {
    public static final crxc a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        crxc crxcVar = new crxc();
        a = crxcVar;
        evsn.registerDefaultInstance(crxc.class, crxcVar);
    }

    private crxc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new crxc();
        }
        if (iOrdinal == 4) {
            return new crxb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crxc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
