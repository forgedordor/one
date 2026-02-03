package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvl extends evsn implements evui {
    public static final crvl a;
    private static volatile evuo k;
    public int b;
    public String c = "";
    public boolean d;
    public int e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;

    static {
        crvl crvlVar = new crvl();
        a = crvlVar;
        evsn.registerDefaultInstance(crvl.class, crvlVar);
    }

    private crvl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new crvl();
        }
        if (iOrdinal == 4) {
            return new crvk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crvl.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
