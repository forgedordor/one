package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class embi extends evsn implements evui {
    public static final embi a;
    private static volatile evuo l;
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

    static {
        embi embiVar = new embi();
        a = embiVar;
        evsn.registerDefaultInstance(embi.class, embiVar);
    }

    private embi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"b", "c", "d", elvq.a, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new embi();
        }
        if (iOrdinal == 4) {
            return new embh();
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
        synchronized (embi.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
