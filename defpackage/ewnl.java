package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewnl extends evsn implements evui {
    public static final ewnl a;
    private static volatile evuo f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        ewnl ewnlVar = new ewnl();
        a = ewnlVar;
        evsn.registerDefaultInstance(ewnl.class, ewnlVar);
    }

    private ewnl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", ewnj.a, "d", "e", ewni.a});
        }
        if (iOrdinal == 3) {
            return new ewnl();
        }
        if (iOrdinal == 4) {
            return new ewnh();
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
        synchronized (ewnl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
