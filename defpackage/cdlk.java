package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlk extends evsn implements evui {
    public static final cdlk a;
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
        cdlk cdlkVar = new cdlk();
        a = cdlkVar;
        evsn.registerDefaultInstance(cdlk.class, cdlkVar);
    }

    private cdlk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006\bဇ\u0007\tဉ\b\nဇ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"b", "c", cdli.a, "d", "e", cdle.a, "f", cdlg.a, "g", "h", cdlc.a, "i", "j", "k", "l", "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new cdlk();
        }
        if (iOrdinal == 4) {
            return new cdlb();
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
        synchronized (cdlk.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}
