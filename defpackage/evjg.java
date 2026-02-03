package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjg extends evsn implements evui {
    public static final evjg a;
    private static volatile evuo l;
    public int b;
    public Object d;
    public long f;
    public long g;
    public long h;
    public evlb i;
    public evqs j;
    public evsx k;
    public int c = 0;
    public String e = "";

    static {
        evjg evjgVar = new evjg();
        a = evjgVar;
        evsn.registerDefaultInstance(evjg.class, evjgVar);
    }

    private evjg() {
        emptyProtobufList();
        this.j = evqs.b;
        emptyProtobufList();
        this.k = emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0001\u0001\b \f\u0000\u0001\u0000\bဂ\t\nဈ\u0001\f<\u0000\r<\u0000\u0011<\u0000\u0012<\u0000\u0014ဂ\u000e\u0017ဂ\u0005\u0019<\u0000\u001aဉ\u0013\u001dည\u0014 '", new Object[]{"d", "c", "b", "g", "e", evin.class, evjq.class, evlh.class, evjk.class, "h", "f", evji.class, "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new evjg();
        }
        if (iOrdinal == 4) {
            return new evjf();
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
        synchronized (evjg.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
