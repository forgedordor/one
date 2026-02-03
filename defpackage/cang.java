package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cang extends evsn implements evui {
    public static final evsy a = new cane();
    public static final cang b;
    private static volatile evuo m;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public evvp i;
    public evvp j;
    public boolean l;
    public String f = "";
    public evsx k = emptyIntList();

    static {
        cang cangVar = new cang();
        b = cangVar;
        evsn.registerDefaultInstance(cang.class, cangVar);
    }

    private cang() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = canj.a;
            return newMessageInfo(b, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005င\u0004\u0007ဉ\u0005\bဉ\u0006\tࠬ\nဇ\u0007", new Object[]{"c", "d", "e", evsvVar, "f", "g", "h", "i", "j", "k", evsvVar, "l"});
        }
        if (iOrdinal == 3) {
            return new cang();
        }
        if (iOrdinal == 4) {
            return new canf();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cang.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
