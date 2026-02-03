package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethk extends evsn implements evui {
    public static final ethk a;
    private static volatile evuo l;
    public int b;
    public etht c;
    public etks d;
    public etop e;
    public etnj f;
    public int g;
    public etgf h;
    public evvp i;
    public ethr j;
    public long k;

    static {
        ethk ethkVar = new ethk();
        a = ethkVar;
        evsn.registerDefaultInstance(ethk.class, ethkVar);
    }

    private ethk() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0004\bဉ\u0005\tဉ\u0006\u000bဉ\b\rဂ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new ethk();
        }
        if (iOrdinal == 4) {
            return new ethj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ethk.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
