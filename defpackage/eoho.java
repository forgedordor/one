package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoho extends evsn implements evui {
    public static final eoho a;
    private static volatile evuo i;
    public int b;
    public int c;
    public boolean d;
    public evsx e = emptyIntList();
    public boolean f;
    public eohi g;
    public boolean h;

    static {
        eoho eohoVar = new eoho();
        a = eohoVar;
        evsn.registerDefaultInstance(eoho.class, eohoVar);
    }

    private eoho() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0003ဇ\u0002\u0006'\u0007ဇ\u0005\bဉ\u0006\u000bဇ\t", new Object[]{"b", "c", eohn.a, "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eoho();
        }
        if (iOrdinal == 4) {
            return new eohm();
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
        synchronized (eoho.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
