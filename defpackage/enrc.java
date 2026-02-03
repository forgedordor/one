package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enrc extends evsn implements evui {
    public static final enrc a;
    private static volatile evuo p;
    public int b;
    public int c;
    public evvp d;
    public int e;
    public int f;
    public evvp g;
    public int h;
    public int i;
    public boolean j;
    public evvp k;
    public boolean l;
    public evvp m;
    public boolean n;
    public evvp o;

    static {
        enrc enrcVar = new enrc();
        a = enrcVar;
        evsn.registerDefaultInstance(enrc.class, enrcVar);
    }

    private enrc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006\bဇ\u0007\tဉ\b\nဇ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"b", "c", enrb.a, "d", "e", enqz.a, "f", enra.a, "g", "h", enqy.a, "i", "j", "k", "l", "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new enrc();
        }
        if (iOrdinal == 4) {
            return new enqx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = p;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enrc.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}
