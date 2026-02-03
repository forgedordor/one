package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxy extends evsn implements evui {
    public static final enxy a;
    private static volatile evuo m;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public int g;
    public int h;
    public int i;
    public int l;
    public String f = "";
    public String j = "";
    public String k = "";

    static {
        enxy enxyVar = new enxy();
        a = enxyVar;
        evsn.registerDefaultInstance(enxy.class, enxyVar);
    }

    private enxy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bဈ\u0007\tဈ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", enxc.a, "h", enyd.a, "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new enxy();
        }
        if (iOrdinal == 4) {
            return new enxx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enxy.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
