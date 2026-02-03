package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyqj extends evsn implements evui {
    public static final eyqj a;
    private static volatile evuo l;
    public int b;
    public eypd c;
    public evqs d = evqs.b;
    public String e = "";
    public int f;
    public eypr g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        eyqj eyqjVar = new eyqj();
        a = eyqjVar;
        evsn.registerDefaultInstance(eyqj.class, eyqjVar);
    }

    private eyqj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003Ȉ\u0004\u0004\u0005ဉ\u0001\u0006\f\u0007\u0007\b\u0007\t\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new eyqj();
        }
        if (iOrdinal == 4) {
            return new eyqi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyqj.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
