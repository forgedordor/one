package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwuf extends evsn implements evui {
    public static final bwuf a;
    private static volatile evuo e;
    public int b;
    public boolean c = true;
    public boolean d = true;

    static {
        bwuf bwufVar = new bwuf();
        a = bwufVar;
        evsn.registerDefaultInstance(bwuf.class, bwufVar);
    }

    private bwuf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bwuf();
        }
        if (iOrdinal == 4) {
            return new bwue();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bwuf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
