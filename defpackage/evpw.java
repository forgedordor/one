package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpw extends evsn implements evui {
    public static final evsy a = new evpu();
    public static final evpw b;
    private static volatile evuo n;
    public int c;
    public long d;
    public long e;
    public int g;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public String f = "";
    public evsx h = emptyIntList();
    public evsx i = emptyIntList();

    static {
        evpw evpwVar = new evpw();
        b = evpwVar;
        evsn.registerDefaultInstance(evpw.class, evpwVar);
    }

    private evpw() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\u000f\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0003\u0003'\u0004ࠬ\u0005ဇ\b\u0006ဇ\u0006\nဃ\u0001\u000bဈ\u0002\fဇ\t\u000f᠌\n", new Object[]{"c", "d", "g", "h", "i", evoz.a, "k", "j", "e", "f", "l", "m", evpq.a});
        }
        if (iOrdinal == 3) {
            return new evpw();
        }
        if (iOrdinal == 4) {
            return new evpv();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evpw.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
