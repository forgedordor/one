package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crku extends evsn<crku, crkt> implements evui {
    public static final crku a;
    private static volatile evuo f;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;

    static {
        crku crkuVar = new crku();
        a = crkuVar;
        evsn.registerDefaultInstance(crku.class, crkuVar);
    }

    private crku() {
    }

    public static /* synthetic */ void a(crku crkuVar) {
        crkuVar.b |= 2;
        crkuVar.d = false;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new crku();
        }
        if (iOrdinal == 4) {
            return new crkt();
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
        synchronized (crku.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
