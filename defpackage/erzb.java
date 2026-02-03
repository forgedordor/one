package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzb extends evsn implements evui {
    public static final erzb a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        erzb erzbVar = new erzb();
        a = erzbVar;
        evsn.registerDefaultInstance(erzb.class, erzbVar);
    }

    private erzb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004\f\u0005Ȉ\u0006\f", new Object[]{"b", "c", "e", "d", "f"});
        }
        if (iOrdinal == 3) {
            return new erzb();
        }
        if (iOrdinal == 4) {
            return new erza();
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
        synchronized (erzb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
