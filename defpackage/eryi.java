package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryi extends evsn implements evui {
    public static final eryi a;
    private static volatile evuo n;
    public int b;
    public Object d;
    public Object f;
    public boolean h;
    public evqs j;
    public int k;
    public long l;
    public evqs m;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public evtg i = evsn.emptyProtobufList();

    static {
        eryi eryiVar = new eryi();
        a = eryiVar;
        evsn.registerDefaultInstance(eryi.class, eryiVar);
    }

    private eryi() {
        emptyIntList();
        evqs evqsVar = evqs.b;
        this.j = evqsVar;
        this.m = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u001a\u0005ည\u0002\u0007;\u0001\t᠌\u0005\n;\u0001\u000bဇ\u0001\rဎ\u0007\u000eည\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", eryh.a, "h", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new eryi();
        }
        if (iOrdinal == 4) {
            return new eryg();
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
        synchronized (eryi.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
