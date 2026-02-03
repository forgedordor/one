package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjh extends evsn implements evui {
    public static final evsy a = new ejiz();
    public static final ejjh b;
    private static volatile evuo n;
    public int c;
    public ejha d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public evsx m = emptyIntList();

    static {
        ejjh ejjhVar = new ejjh();
        b = ejjhVar;
        evsn.registerDefaultInstance(ejjh.class, ejjhVar);
    }

    private ejjh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007င\u0006\b᠌\u0007\t᠌\b\nࠬ", new Object[]{"c", "d", "e", "f", ejjd.a, "g", "h", "i", "j", "k", ejjf.a, "l", ejjb.a, "m", ezam.a});
        }
        if (iOrdinal == 3) {
            return new ejjh();
        }
        if (iOrdinal == 4) {
            return new ejja();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejjh.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
