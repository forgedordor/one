package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzm extends evsn implements evui {
    public static final cjzm a;
    private static volatile evuo e;
    public evub b;
    public evub c;
    public evub d;

    static {
        cjzm cjzmVar = new cjzm();
        a = cjzmVar;
        evsn.registerDefaultInstance(cjzm.class, cjzmVar);
    }

    private cjzm() {
        evub evubVar = evub.a;
        this.b = evubVar;
        this.c = evubVar;
        this.d = evubVar;
    }

    public final evub a() {
        evub evubVar = this.d;
        if (!evubVar.b) {
            this.d = evubVar.a();
        }
        return this.d;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", cjzk.a, "c", cjzl.a, "d", cjzj.a});
        }
        if (iOrdinal == 3) {
            return new cjzm();
        }
        if (iOrdinal == 4) {
            return new cjzi();
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
        synchronized (cjzm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
