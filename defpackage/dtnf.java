package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnf extends evsn implements evui {
    public static final dtnf a;
    private static volatile evuo f;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e;

    static {
        dtnf dtnfVar = new dtnf();
        a = dtnfVar;
        evsn.registerDefaultInstance(dtnf.class, dtnfVar);
    }

    private dtnf() {
    }

    static /* synthetic */ void a(dtnf dtnfVar) {
        dtnfVar.b |= 4;
        dtnfVar.e = false;
    }

    static /* synthetic */ void b(dtnf dtnfVar) {
        dtnfVar.b |= 2;
        dtnfVar.d = true;
    }

    static /* synthetic */ void c(dtnf dtnfVar) {
        dtnfVar.b |= 1;
        dtnfVar.c = true;
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
            return new dtnf();
        }
        if (iOrdinal == 4) {
            return new dtne();
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
        synchronized (dtnf.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
