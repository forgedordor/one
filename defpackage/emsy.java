package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsy extends evsn implements evui {
    public static final emsy a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    static {
        emsy emsyVar = new emsy();
        a = emsyVar;
        evsn.registerDefaultInstance(emsy.class, emsyVar);
    }

    private emsy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005", new Object[]{"b", "c", emsx.a, "d", emsw.a, "e", emtf.a, "f", emsv.a, "g", emst.a, "h"});
        }
        if (iOrdinal == 3) {
            return new emsy();
        }
        if (iOrdinal == 4) {
            return new emsu();
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
        synchronized (emsy.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
