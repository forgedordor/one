package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbn extends evsn implements evui {
    public static final sbn a;
    private static volatile evuo g;
    public int b;
    public sdi c;
    public sdl d;
    public sdo e;
    public sdf f;

    static {
        sbn sbnVar = new sbn();
        a = sbnVar;
        evsn.registerDefaultInstance(sbn.class, sbnVar);
    }

    private sbn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u00017Ĩ\u0004\u0000\u0000\u00007ဉ\u0000ģဉ\u0001ħဉ\u0002Ĩဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new sbn();
        }
        if (iOrdinal == 4) {
            return new sbm();
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
        synchronized (sbn.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
