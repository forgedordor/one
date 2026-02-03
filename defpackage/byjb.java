package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byjb extends evsn implements evui {
    public static final byjb a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public int g;
    public evvp h;
    public byiy i;
    public boolean j;

    static {
        byjb byjbVar = new byjb();
        a = byjbVar;
        evsn.registerDefaultInstance(byjb.class, byjbVar);
    }

    private byjb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006င\u0005\u0007ဉ\u0006\bဉ\u0007\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new byjb();
        }
        if (iOrdinal == 4) {
            return new byiw();
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
        synchronized (byjb.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
