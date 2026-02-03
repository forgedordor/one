package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chmc extends evsn implements evui {
    public static final chmc a;
    private static volatile evuo f;
    public int b;
    public evvp d;
    public evub e = evub.a;
    public String c = "";

    static {
        chmc chmcVar = new chmc();
        a = chmcVar;
        evsn.registerDefaultInstance(chmc.class, chmcVar);
    }

    private chmc() {
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
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0000\u0000\u0002ဈ\u0000\u0004ဉ\u0001\u00052", new Object[]{"b", "c", "d", "e", chmb.a});
        }
        if (iOrdinal == 3) {
            return new chmc();
        }
        if (iOrdinal == 4) {
            return new chma();
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
        synchronized (chmc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
