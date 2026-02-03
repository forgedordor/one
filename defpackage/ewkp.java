package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewkp extends evsn implements evui {
    public static final ewkp a;
    private static volatile evuo f;
    public int b;
    public int c;
    public boolean d;
    public evtg e = emptyProtobufList();

    static {
        ewkp ewkpVar = new ewkp();
        a = ewkpVar;
        evsn.registerDefaultInstance(ewkp.class, ewkpVar);
    }

    private ewkp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002င\u0000\u0004ဇ\u0001\u0005\u001b", new Object[]{"b", "c", "d", "e", ewko.class});
        }
        if (iOrdinal == 3) {
            return new ewkp();
        }
        if (iOrdinal == 4) {
            return new ewkm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewkp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
