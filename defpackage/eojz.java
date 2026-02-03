package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojz extends evsn implements evui {
    public static final eojz a;
    private static volatile evuo k;
    public int b;
    public evtg c = emptyProtobufList();
    public evta d = emptyLongList();
    public evta e = emptyLongList();
    public evta f = emptyLongList();
    public evta g = emptyLongList();
    public long h;
    public long i;
    public int j;

    static {
        eojz eojzVar = new eojz();
        a = eojzVar;
        evsn.registerDefaultInstance(eojz.class, eojzVar);
    }

    private eojz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002\u0007&\b&", new Object[]{"b", "c", eoir.class, "d", "f", "h", "i", "j", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new eojz();
        }
        if (iOrdinal == 4) {
            return new eojy();
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
        synchronized (eojz.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
