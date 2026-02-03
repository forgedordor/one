package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppf extends evsn implements evui {
    public static final eppf a;
    private static volatile evuo f;
    public boolean b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        eppf eppfVar = new eppf();
        a = eppfVar;
        evsn.registerDefaultInstance(eppf.class, eppfVar);
    }

    private eppf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eppf();
        }
        if (iOrdinal == 4) {
            return new eppe();
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
        synchronized (eppf.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
