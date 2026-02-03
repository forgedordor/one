package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envy extends evsn implements evui {
    public static final envy a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public int g;

    static {
        envy envyVar = new envy();
        a = envyVar;
        evsn.registerDefaultInstance(envy.class, envyVar);
    }

    private envy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0002\b<\u0000", new Object[]{"d", "c", "b", "e", envh.a, "f", envr.class, envv.class, envl.class, envp.class, "g", envx.a, envn.class});
        }
        if (iOrdinal == 3) {
            return new envy();
        }
        if (iOrdinal == 4) {
            return new envw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (envy.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
