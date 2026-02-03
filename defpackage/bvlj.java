package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvlj extends evsn implements evui {
    public static final bvlj a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public String d = "";
    public long e;
    public boolean f;
    public boolean g;

    static {
        bvlj bvljVar = new bvlj();
        a = bvljVar;
        evsn.registerDefaultInstance(bvlj.class, bvljVar);
    }

    private bvlj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new bvlj();
        }
        if (iOrdinal == 4) {
            return new bvli();
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
        synchronized (bvlj.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
