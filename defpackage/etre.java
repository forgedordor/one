package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etre extends evsn implements evui {
    public static final etre a;
    private static volatile evuo g;
    public int b;
    public etrk c;
    public etrk d;
    public etrm e;
    public etry f;

    static {
        etre etreVar = new etre();
        a = etreVar;
        evsn.registerDefaultInstance(etre.class, etreVar);
    }

    private etre() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "e", "f", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etre();
        }
        if (iOrdinal == 4) {
            return new etrd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etre.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
