package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqu extends evsn implements evui {
    public static final dtqu a;
    private static volatile evuo j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        dtqu dtquVar = new dtqu();
        a = dtquVar;
        evsn.registerDefaultInstance(dtqu.class, dtquVar);
    }

    private dtqu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dtqu();
        }
        if (iOrdinal == 4) {
            return new dtqt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dtqu.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
