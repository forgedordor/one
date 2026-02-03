package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensc extends evsn implements evui {
    public static final ensc a;
    private static volatile evuo g;
    public int b;
    public emog c;
    public emoc d;
    public ensa e;
    public enry f;

    static {
        ensc enscVar = new ensc();
        a = enscVar;
        evsn.registerDefaultInstance(ensc.class, enscVar);
    }

    private ensc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ensc();
        }
        if (iOrdinal == 4) {
            return new ensb();
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
        synchronized (ensc.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
