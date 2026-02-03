package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggb extends evsn implements evui {
    public static final cggb a;
    private static volatile evuo e;
    public int b;
    public int c = 1;
    public boolean d;

    static {
        cggb cggbVar = new cggb();
        a = cggbVar;
        evsn.registerDefaultInstance(cggb.class, cggbVar);
    }

    private cggb() {
    }

    public static /* synthetic */ void a(cggb cggbVar) {
        cggbVar.b |= 2;
        cggbVar.d = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", cgfz.a, "d"});
        }
        if (iOrdinal == 3) {
            return new cggb();
        }
        if (iOrdinal == 4) {
            return new cgfy();
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
        synchronized (cggb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
