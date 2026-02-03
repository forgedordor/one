package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enlz extends evsn implements evui {
    public static final enlz a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public long h;

    static {
        enlz enlzVar = new enlz();
        a = enlzVar;
        evsn.registerDefaultInstance(enlz.class, enlzVar);
    }

    private enlz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", enlu.a, "d", enlw.a, "e", enlv.a, "f", enlx.a, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new enlz();
        }
        if (iOrdinal == 4) {
            return new enlt();
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
        synchronized (enlz.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
