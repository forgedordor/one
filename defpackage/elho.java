package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elho extends evsn implements evui {
    public static final evsy a = new elhg();
    public static final elho b;
    private static volatile evuo o;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public evsx j = emptyIntList();
    public boolean k;
    public boolean l;
    public int m;
    public int n;

    static {
        elho elhoVar = new elho();
        b = elhoVar;
        evsn.registerDefaultInstance(elho.class, elhoVar);
    }

    private elho() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ࠬ\bဇ\u0006\tဇ\u0007\nင\b\u000bင\t", new Object[]{"c", "d", elhl.a, "e", elhh.a, "f", "g", emkb.a, "h", "i", "j", elhj.a, "k", "l", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new elho();
        }
        if (iOrdinal == 4) {
            return new elhn();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elho.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}
