package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eltk extends evsn implements evui {
    public static final eltk a;
    private static volatile evuo l;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public eltj f;
    public int g = -1;
    public evsx h = emptyIntList();
    public String i = "";
    public int j;
    public encz k;

    static {
        eltk eltkVar = new eltk();
        a = eltkVar;
        evsn.registerDefaultInstance(eltk.class, eltkVar);
    }

    private eltk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005င\u0004\u0006'\u0007ဈ\u0005\b᠌\u0006\tဉ\u0007", new Object[]{"b", "c", "d", "e", elth.a, "f", "g", "h", "i", "j", enwq.a, "k"});
        }
        if (iOrdinal == 3) {
            return new eltk();
        }
        if (iOrdinal == 4) {
            return new eltg();
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
        synchronized (eltk.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
