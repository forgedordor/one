package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausj extends evsn implements evui {
    public static final ausj a;
    private static volatile evuo o;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        ausj ausjVar = new ausj();
        a = ausjVar;
        evsn.registerDefaultInstance(ausj.class, ausjVar);
    }

    private ausj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0004\u0004ဂ\u0005\u0005ဋ\u0006\u0006ဋ\u0007\u0007ဋ\b\bဋ\t\tဋ\n\nဋ\u000b\u000bဋ\f\fဋ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new ausj();
        }
        if (iOrdinal == 4) {
            return new ausi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ausj.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}
