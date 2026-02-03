package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcn extends evsn implements evui {
    public static final ajcn a;
    private static volatile evuo g;
    public int b;
    public evub c = evub.a;
    public int d;
    public int e;
    public int f;

    static {
        ajcn ajcnVar = new ajcn();
        a = ajcnVar;
        evsn.registerDefaultInstance(ajcn.class, ajcnVar);
    }

    private ajcn() {
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
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002င\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", ajcm.a, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajcn();
        }
        if (iOrdinal == 4) {
            return new ajcl();
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
        synchronized (ajcn.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
