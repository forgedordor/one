package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiyd extends evsn implements evui {
    public static final aiyd a;
    private static volatile evuo p;
    public int b;
    public int c;
    public elpr d;
    public int e;
    public int h;
    public int j;
    public int k;
    public aiyg l;
    public int m;
    public long n;
    public int f = -1;
    public int g = -2;
    public int i = -1;
    public int o = -1;

    static {
        aiyd aiydVar = new aiyd();
        a = aiydVar;
        evsn.registerDefaultInstance(aiyd.class, aiydVar);
    }

    private aiyd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဏ\u0003\u0005ဏ\u0004\u0006᠌\u0005\u0007ဏ\u0006\bဋ\u0007\tဋ\b\nဉ\t\u000b᠌\n\fတ\u000b\rဏ\f", new Object[]{"b", "c", elob.a, "d", "e", "f", "g", "h", ewdg.a, "i", "j", "k", "l", "m", elpe.a, "n", "o"});
        }
        if (iOrdinal == 3) {
            return new aiyd();
        }
        if (iOrdinal == 4) {
            return new aiyc();
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
        synchronized (aiyd.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}
