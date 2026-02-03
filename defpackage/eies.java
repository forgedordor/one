package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eies extends evsn implements evui {
    public static final eies a;
    private static volatile evuo n;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;

    static {
        eies eiesVar = new eies();
        a = eiesVar;
        evsn.registerDefaultInstance(eies.class, eiesVar);
    }

    private eies() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0005\u0006ဇ\b\u0007င\u0007\b᠌\t\tဇ\n\nင\u0004\u000bင\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "k", "j", "l", eieq.a, "m", "g", "i"});
        }
        if (iOrdinal == 3) {
            return new eies();
        }
        if (iOrdinal == 4) {
            return new eiep();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eies.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
