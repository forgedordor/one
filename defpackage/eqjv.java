package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjv extends evsn implements evui {
    public static final eqjv a;
    private static volatile evuo m;
    public int b;
    public int f;
    public evqe h;
    public evqe i;
    public evvp j;
    public evvp k;
    public evvp l;
    public evub g = evub.a;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        eqjv eqjvVar = new eqjv();
        a = eqjvVar;
        evsn.registerDefaultInstance(eqjv.class, eqjvVar);
    }

    private eqjv() {
        evqs evqsVar = evqs.b;
        evsn.emptyProtobufList();
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
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\u0012\n\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0006\f\tဉ\u0001\nဉ\u0002\u000bဉ\u0003\fဉ\u0004\u00102\u0011ဉ\u0005\u0012Ȉ", new Object[]{"b", "c", "e", "f", "h", "i", "j", "k", "g", eqju.a, "l", "d"});
        }
        if (iOrdinal == 3) {
            return new eqjv();
        }
        if (iOrdinal == 4) {
            return new eqjt();
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
        synchronized (eqjv.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
