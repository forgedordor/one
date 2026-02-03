package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxu extends evsn implements evui {
    public static final elxu a;
    private static volatile evuo k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public elho i;
    public int j;

    static {
        elxu elxuVar = new elxu();
        a = elxuVar;
        evsn.registerDefaultInstance(elxu.class, elxuVar);
    }

    private elxu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဉ\u0006\b᠌\u0007", new Object[]{"b", "c", "d", elxq.a, "e", elxt.a, "f", "g", elht.a, "h", exms.a, "i", "j", emjb.a});
        }
        if (iOrdinal == 3) {
            return new elxu();
        }
        if (iOrdinal == 4) {
            return new elxs();
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
        synchronized (elxu.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
