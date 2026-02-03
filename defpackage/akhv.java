package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akhv extends evsn implements evui {
    public static final akhv a;
    private static volatile evuo n;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;

    static {
        akhv akhvVar = new akhv();
        a = akhvVar;
        evsn.registerDefaultInstance(akhv.class, akhvVar);
    }

    private akhv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဃ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဃ\t\u000bဃ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new akhv();
        }
        if (iOrdinal == 4) {
            return new akhu();
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
        synchronized (akhv.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
