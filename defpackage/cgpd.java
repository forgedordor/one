package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgpd extends evsn implements evui {
    public static final cgpd a;
    private static volatile evuo g;
    public int b;
    public boolean d;
    public boolean e;
    public evub c = evub.a;
    public boolean f = true;

    static {
        cgpd cgpdVar = new cgpd();
        a = cgpdVar;
        evsn.registerDefaultInstance(cgpd.class, cgpdVar);
    }

    private cgpd() {
    }

    public final evub a() {
        evub evubVar = this.c;
        if (!evubVar.b) {
            this.c = evubVar.a();
        }
        return this.c;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", cgpc.a, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cgpd();
        }
        if (iOrdinal == 4) {
            return new cgpb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cgpd.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
