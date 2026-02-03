package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elrz extends evsn implements evui {
    public static final elrz a;
    private static volatile evuo s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;

    static {
        elrz elrzVar = new elrz();
        a = elrzVar;
        evsn.registerDefaultInstance(elrz.class, elrzVar);
    }

    private elrz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elwd.a;
            return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0012\u0010\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b\n᠌\t\u000bင\n\fင\u000b\u000eဇ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011", new Object[]{"b", "c", enwq.a, "d", Celse.a, "e", elut.a, "f", evsvVar, "g", evsvVar, "h", evsvVar, "i", evsvVar, "j", evsvVar, "k", evsvVar, "l", "m", "n", "o", enmq.a, "p", evsvVar, "q", evsvVar, "r", evsvVar});
        }
        if (iOrdinal == 3) {
            return new elrz();
        }
        if (iOrdinal == 4) {
            return new elry();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elrz.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
