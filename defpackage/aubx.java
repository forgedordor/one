package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubx extends evsn implements evui {
    public static final aubx a;
    private static volatile evuo f;
    public int b;
    public evub e = evub.a;
    public String c = "";
    public String d = "";

    static {
        aubx aubxVar = new aubx();
        a = aubxVar;
        evsn.registerDefaultInstance(aubx.class, aubxVar);
    }

    private aubx() {
    }

    public final evub a() {
        evub evubVar = this.e;
        if (!evubVar.b) {
            this.e = evubVar.a();
        }
        return this.e;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"b", "c", "d", "e", aubw.a});
        }
        if (iOrdinal == 3) {
            return new aubx();
        }
        if (iOrdinal == 4) {
            return new aubv();
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
        synchronized (aubx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
