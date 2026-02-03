package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdj extends evsn implements evui {
    public static final etdj a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public boolean f;
    private boolean i;
    public evtg d = evsn.emptyProtobufList();
    public long e = -1;
    public String g = "";

    static {
        etdj etdjVar = new etdj();
        a = etdjVar;
        evsn.registerDefaultInstance(etdj.class, etdjVar);
    }

    private etdj() {
    }

    public static /* synthetic */ void a(etdj etdjVar) {
        etdjVar.b |= 8;
        etdjVar.i = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
        }
        if (iOrdinal == 3) {
            return new etdj();
        }
        if (iOrdinal == 4) {
            return new etdi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etdj.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
