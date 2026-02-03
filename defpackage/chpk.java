package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpk extends evsn implements evui {
    public static final chpk a;
    private static volatile evuo k;
    public int b;
    public chpe c;
    public chph d;
    public String e = "";
    public chpo f;
    public boolean g;
    public boolean h;
    public boolean i;
    public evvp j;

    static {
        chpk chpkVar = new chpk();
        a = chpkVar;
        evsn.registerDefaultInstance(chpk.class, chpkVar);
    }

    private chpk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ለ\u0003\u0006ဉ\u0004\bဇ\u0006\tဇ\u0007\u000bဇ\t\fဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new chpk();
        }
        if (iOrdinal == 4) {
            return new chpj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (chpk.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
