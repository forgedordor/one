package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjj extends evsn implements evui {
    public static final ezjj a;
    private static volatile evuo o;
    public int b;
    public String c = "";
    public int d;
    public evqs e;
    public long f;
    public ezol g;
    public evqs h;
    public ezol i;
    public ezol j;
    public int k;
    public ezjx l;
    public long m;
    public fhaz n;

    static {
        ezjj ezjjVar = new ezjj();
        a = ezjjVar;
        evsn.registerDefaultInstance(ezjj.class, ezjjVar);
    }

    private ezjj() {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.h = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\f\u0000\u0001\u0001\u0019\f\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0005\f\u0007\u0002\bဉ\u0000\tဉ\u0001\nဉ\u0002\f\n\u0011\n\u0017ဉ\u0003\u0019ဉ\u0006", new Object[]{"b", "c", "d", "f", "k", "m", "g", "i", "j", "e", "h", "l", "n"});
        }
        if (iOrdinal == 3) {
            return new ezjj();
        }
        if (iOrdinal == 4) {
            return new ezjg();
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
        synchronized (ezjj.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}
