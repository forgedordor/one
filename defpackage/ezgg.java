package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezgg extends evsn implements evui {
    public static final evsy a = new ezge();
    public static final ezgg b;
    private static volatile evuo s;
    public int c;
    public int d;
    public int e;
    public float f;
    public int g;
    public ezdi i;
    public ezgs j;
    public int l;
    public long p;
    public ezfh r;
    public evsx h = emptyIntList();
    public String k = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String q = "";

    static {
        ezgg ezggVar = new ezgg();
        b = ezggVar;
        evsn.registerDefaultInstance(ezgg.class, ezggVar);
    }

    private ezgg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0000\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0001\u0000\u0001\f\u0002\u0001\u0003\f\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007\f\bȈ\tȈ\nȈ\u000b\u0002\f\f\rȈ\u000eဉ\u0002\u0010,", new Object[]{"c", "d", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "e", "q", "r", "h"});
        }
        if (iOrdinal == 3) {
            return new ezgg();
        }
        if (iOrdinal == 4) {
            return new ezgf();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezgg.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
