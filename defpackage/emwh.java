package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwh extends evsn implements evui {
    public static final emwh a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        emwh emwhVar = new emwh();
        a = emwhVar;
        evsn.registerDefaultInstance(emwh.class, emwhVar);
    }

    private emwh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new emwh();
        }
        if (iOrdinal == 4) {
            return new emwg();
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
        synchronized (emwh.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
