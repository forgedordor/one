package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjlg extends evsn implements evui {
    public static final cjlg a;
    private static volatile evuo i;
    public int b;
    public evqe c;
    public cjlm d;
    public cjgr e;
    public cjib f;
    public cjih g;
    public int h;

    static {
        cjlg cjlgVar = new cjlg();
        a = cjlgVar;
        evsn.registerDefaultInstance(cjlg.class, cjlgVar);
    }

    private cjlg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", cjiw.a});
        }
        if (iOrdinal == 3) {
            return new cjlg();
        }
        if (iOrdinal == 4) {
            return new cjlf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjlg.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
