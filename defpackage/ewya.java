package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewya extends evsn implements evui {
    public static final ewya a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        ewya ewyaVar = new ewya();
        a = ewyaVar;
        evsn.registerDefaultInstance(ewya.class, ewyaVar);
    }

    private ewya() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0003\f\u0004ဋ\u0000\u0005ဋ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ewya();
        }
        if (iOrdinal == 4) {
            return new ewxz();
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
        synchronized (ewya.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
