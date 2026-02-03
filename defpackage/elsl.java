package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elsl extends evsn implements evui {
    public static final elsl a;
    private static volatile evuo m;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public String i = "";
    public long j;
    public elvv k;
    public ewfc l;

    static {
        elsl elslVar = new elsl();
        a = elslVar;
        evsn.registerDefaultInstance(elsl.class, elslVar);
    }

    private elsl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elsj.a;
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\u000bဉ\n", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", enwq.a, "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new elsl();
        }
        if (iOrdinal == 4) {
            return new elsi();
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
        synchronized (elsl.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
