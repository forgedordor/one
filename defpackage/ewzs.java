package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewzs extends evsn implements evui {
    public static final ewzs a;
    private static volatile evuo i;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    static {
        ewzs ewzsVar = new ewzs();
        a = ewzsVar;
        evsn.registerDefaultInstance(ewzs.class, ewzsVar);
    }

    private ewzs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0005\u0004\u0006\f\u0007\f\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ewzs();
        }
        if (iOrdinal == 4) {
            return new ewzr();
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
        synchronized (ewzs.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
