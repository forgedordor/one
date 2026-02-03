package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezcl extends evsn implements evui {
    public static final ezcl a;
    private static volatile evuo m;
    public int b;
    public int c;
    public ezck d;
    public ezcg e;
    public ezbz f;
    public ezcc g;
    public ezce h;
    public ezci i;
    public ezbz j;
    public ezbz k;
    public ezcc l;

    static {
        ezcl ezclVar = new ezcl();
        a = ezclVar;
        evsn.registerDefaultInstance(ezcl.class, ezclVar);
    }

    private ezcl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new ezcl();
        }
        if (iOrdinal == 4) {
            return new ezbx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezcl.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
