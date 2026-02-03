package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmp extends evsn<dzmp, dzmo> implements evui {
    public static final dzmp a;
    private static volatile evuo j;
    public boolean b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    private int k;

    static {
        dzmp dzmpVar = new dzmp();
        a = dzmpVar;
        evsn.registerDefaultInstance(dzmp.class, dzmpVar);
    }

    private dzmp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dzmp();
        }
        if (iOrdinal == 4) {
            return new dzmo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dzmp.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
