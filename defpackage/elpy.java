package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpy extends evsn implements evui {
    public static final elpy a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public int g;
    public int h;

    static {
        elpy elpyVar = new elpy();
        a = elpyVar;
        evsn.registerDefaultInstance(elpy.class, elpyVar);
    }

    private elpy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", elpx.a, "h"});
        }
        if (iOrdinal == 3) {
            return new elpy();
        }
        if (iOrdinal == 4) {
            return new elpw();
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
        synchronized (elpy.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
