package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chit extends evsn implements evui {
    public static final chit a;
    private static volatile evuo q;
    public int b;
    public long c;
    public int e;
    public boolean f;
    public int h;
    public boolean k;
    public evvp m;
    public int n;
    public fhaz p;
    public String d = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String o = "";

    static {
        chit chitVar = new chit();
        a = chitVar;
        evsn.registerDefaultInstance(chit.class, chitVar);
    }

    private chit() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0004\u0007Ȉ\bȈ\t\u0007\nȈ\u000bဉ\u0000\f\u0004\rȈ\u000eဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new chit();
        }
        if (iOrdinal == 4) {
            return new chis();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = q;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (chit.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}
