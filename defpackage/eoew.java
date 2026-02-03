package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoew extends evsn implements evui {
    public static final eoew a;
    private static volatile evuo i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public evtg h = emptyProtobufList();

    static {
        eoew eoewVar = new eoew();
        a = eoewVar;
        evsn.registerDefaultInstance(eoew.class, eoewVar);
    }

    private eoew() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001b\u0006ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", eoem.class, "g"});
        }
        if (iOrdinal == 3) {
            return new eoew();
        }
        if (iOrdinal == 4) {
            return new eoev();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoew.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
